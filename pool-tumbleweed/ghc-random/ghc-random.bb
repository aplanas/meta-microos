SUMMARY = "Pseudo-random number generation"
DESCRIPTION = "This package provides basic pseudo-random number generation, including the \
ability to split random number generators. \
 \
== 'System.Random': pure pseudo-random number interface \
 \
In pure code, use 'System.Random.uniform' and 'System.Random.uniformR' from \
'System.Random' to generate pseudo-random numbers with a pure pseudo-random \
number generator like 'System.Random.StdGen'. \
 \
As an example, here is how you can simulate rolls of a six-sided die using \
'System.Random.uniformR': \
 \
>>> let roll = uniformR (1, 6) :: RandomGen g => g -> (Word, g) >>> let rolls = \
unfoldr (Just . roll) :: RandomGen g => g -> [Word] >>> let pureGen = mkStdGen \
42 >>> take 10 (rolls pureGen) :: [Word] [1,1,3,2,4,5,3,4,6,2] \
 \
See 'System.Random' for more details. \
 \
== 'System.Random.Stateful': monadic pseudo-random number interface \
 \
In monadic code, use 'System.Random.Stateful.uniformM' and \
'System.Random.Stateful.uniformRM' from 'System.Random.Stateful' to generate \
pseudo-random numbers with a monadic pseudo-random number generator, or using a \
monadic adapter. \
 \
As an example, here is how you can simulate rolls of a six-sided die using \
'System.Random.Stateful.uniformRM': \
 \
>>> let rollM = uniformRM (1, 6) :: StatefulGen g m => g -> m Word >>> let \
pureGen = mkStdGen 42 >>> runStateGen_ pureGen (replicateM 10 . rollM) :: \
[Word] [1,1,3,2,4,5,3,4,6,2] \
 \
The monadic adapter 'System.Random.Stateful.runStateGen_' is used here to lift \
the pure pseudo-random number generator 'pureGen' into the \
'System.Random.Stateful.StatefulGen' context. \
 \
The monadic interface can also be used with existing monadic pseudo-random \
number generators. In this example, we use the one provided in the \
<https://hackage.haskell.org/package/mwc-random mwc-random> package: \
 \
>>> import System.Random.MWC as MWC >>> let rollM = uniformRM (1, 6) :: \
StatefulGen g m => g -> m Word >>> monadicGen <- MWC.create >>> replicateM 10 \
(rollM monadicGen) :: IO [Word] [2,3,6,6,4,4,3,1,5,4] \
 \
See 'System.Random.Stateful' for more details."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-1.2.1.1-2.3.aarch64.rpm"
RPM_HASH = "bbaa734ff0e00fab417c7aa830089b48f62e790459df8aa4790770081e3144cf2ec852708948971b9e184ec87571427289346a0f8358319f185b1e671f979131"

RPROVIDES:${PN} += "ghc-random \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
