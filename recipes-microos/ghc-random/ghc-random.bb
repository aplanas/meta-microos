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

RPM_NAME = "ghc-random-1.2.1.1-2.2.aarch64.rpm"
RPM_HASH = "5cb00a66f7d669abd5219ddcc192a6b5b8602e557d28b8ed5118c9ebd1876262319bd88ba9efe4ebf169163776f765f83463f5843565468384268c28d1dd523a"

RPROVIDES:${PN} += "ghc-random ghc-random(aarch-64) libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
