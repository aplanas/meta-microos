SUMMARY = "Library of safe (exception free) functions"
DESCRIPTION = "A library wrapping 'Prelude'/'Data.List' functions that can throw exceptions, \
such as 'head' and '!!'. Each unsafe function has up to four variants, e.g. \
with 'tail': \
 \
* 'tail :: [a] -> [a]', raises an error on 'tail []'. \
 \
* 'tailMay :: [a] -> /Maybe/ [a]', turns errors into 'Nothing'. \
 \
* 'tailDef :: /[a]/ -> [a] -> [a]', takes a default to return on errors. \
 \
* 'tailNote :: /String/ -> [a] -> [a]', takes an extra argument which \
supplements the error message. \
 \
* 'tailSafe :: [a] -> [a]', returns some sensible default if possible, '[]' in \
the case of 'tail'. \
 \
This package is divided into three modules: \
 \
* 'Safe' contains safe variants of 'Prelude' and 'Data.List' functions. \
 \
* 'Safe.Foldable' contains safe variants of 'Foldable' functions. \
 \
* 'Safe.Exact' creates crashing versions of functions like 'zip' (errors if the \
lists are not equal) and 'take' (errors if there are not enough elements), then \
wraps them to provide safe variants."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-0.3.19-4.8.aarch64.rpm"
RPM_HASH = "29fcd674c763a7a6fb6dd828b094fb094b04cbb1ef970b6f7bf0fd888a3fd4847fc9979e89814d9ad0b05af9ee3de494f260a9245ea99643ebb55944295010be"

RPROVIDES:${PN} += "ghc-safe \
libHSsafe-0.3.19-9uHvZjuyLiR13wOGSONZxX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
