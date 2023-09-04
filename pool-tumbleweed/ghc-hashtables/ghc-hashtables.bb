SUMMARY = "Mutable hash tables in the ST monad"
DESCRIPTION = "This package provides a couple of different implementations of mutable hash \
tables in the ST monad, as well as a typeclass abstracting their common \
operations, and a set of wrappers to use the hash tables in the IO monad. \
 \
/QUICK START/: documentation for the hash table operations is provided in the \
'Data.HashTable.Class' module, and the IO wrappers (which most users will \
probably prefer) are located in the 'Data.HashTable.IO' module. \
 \
This package currently contains three hash table implementations: \
 \
1. 'Data.HashTable.ST.Cuckoo' contains an implementation of 'cuckoo hashing' as \
introduced by Pagh and Rodler in 2001 (see \
<http://en.wikipedia.org/wiki/Cuckoo_hashing>). Cuckoo hashing has worst-case \
/O(1)/ lookups and can reach a high 'load factor', in which the table can \
perform acceptably well even when approaching 90% full. Randomized testing \
shows this implementation of cuckoo hashing to be slightly faster on insert and \
slightly slower on lookup than 'Data.HashTable.ST.Basic', while being more \
space efficient by about a half-word per key-value mapping. Cuckoo hashing, \
like the basic hash table implementation using linear probing, can suffer from \
long delays when the table is resized. \
 \
2. 'Data.HashTable.ST.Basic' contains a basic open-addressing hash table using \
linear probing as the collision strategy. On a pure speed basis it should \
currently be the fastest available Haskell hash table implementation for \
lookups, although it has a higher memory overhead than the other tables and can \
suffer from long delays when the table is resized because all of the elements \
in the table need to be rehashed. \
 \
3. 'Data.HashTable.ST.Linear' contains a linear hash table (see \
<http://en.wikipedia.org/wiki/Linear_hashing>), which trades some insert and \
lookup performance for higher space efficiency and much shorter delays when \
expanding the table. In most cases, benchmarks show this table to be currently \
slightly faster than 'Data.HashTable' from the Haskell base library. \
 \
It is recommended to create a concrete type alias in your code when using this \
package, i.e.: \
 \
> import qualified Data.HashTable.IO as H > > type HashTable k v = \
H.BasicHashTable k v > > foo :: IO (HashTable Int Int) > foo = do > ht <- H.new \
> H.insert ht 1 1 > return ht \
 \
Firstly, this makes it easy to switch to a different hash table implementation, \
and secondly, using a concrete type rather than leaving your functions abstract \
in the HashTable class should allow GHC to optimize away the typeclass \
dictionaries. \
 \
This package accepts a couple of different cabal flags: \
 \
* 'unsafe-tricks', default /ON/. If this flag is enabled, we use some unsafe \
GHC-specific tricks to save indirections (namely 'unsafeCoerce#' and \
'reallyUnsafePtrEquality#'. These techniques rely on assumptions about the \
behaviour of the GHC runtime system and, although they've been tested and \
should be safe under normal conditions, are slightly dangerous. Caveat emptor. \
In particular, these techniques are incompatible with HPC code coverage \
reports. \
 \
* 'sse42', default /OFF/. If this flag is enabled, we use some SSE 4.2 \
instructions (see <http://en.wikipedia.org/wiki/SSE4>, first available on Intel \
Core 2 processors) to speed up cache-line searches for cuckoo hashing. \
 \
* 'bounds-checking', default /OFF/. If this flag is enabled, array accesses are \
bounds-checked. \
 \
* 'debug', default /OFF/. If turned on, we'll rudely spew debug output to \
stdout. \
 \
* 'portable', default /OFF/. If this flag is enabled, we use only pure Haskell \
code and try not to use unportable GHC extensions. Turning this flag on forces \
'unsafe-tricks' and 'sse42' /OFF/. \
 \
Please send bug reports to \
<https://github.com/gregorycollins/hashtables/issues>."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-1.3.1-1.9.aarch64.rpm"
RPM_HASH = "5c4c2f38f83d7e9ca1c7abb2df265c28de231320fd8551f13cdedb2332e9406519f6739a9ffd6d9184b54d4e381139819d8a806901d4ca2797f0c664ae2f881d"

RPROVIDES:${PN} += "ghc-hashtables \
libHShashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
