SUMMARY = "Haskell criterion profiling library"
DESCRIPTION = "This package provides the Haskell criterion profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.6.0.0"

RPM_NAME = "ghc-criterion-prof-1.6.0.0-2.4.aarch64.rpm"
RPM_HASH = "1eb1cdd4da78a1a93e3fe5fb2f704cad5b09db9b73429b23ad9c8a2e0d106c274c9ebf5164591a48397f393a34870bd2e6e662ad590432855bfdf342e4e398bd"

RPROVIDES:${PN} += "ghc-criterion-prof \
ghc-criterion-prof(aarch-64) \
ghc-prof(criterion-1.6.0.0-DRzDBgvFHz63cqdMc7T97x)"
RDEPENDS:${PN} += "ghc-criterion-devel \
ghc-prof(Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R) \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD) \
ghc-prof(code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D) \
ghc-prof(containers-0.6.7) \
ghc-prof(criterion-measurement-0.2.1.0-87nlGOXoqxrBN5mUt0bPv1) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d) \
ghc-prof(microstache-1.0.2.3-AHAKnK06lT6DHccapktUKL) \
ghc-prof(mtl-2.2.2) \
ghc-prof(mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP) \
ghc-prof(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(statistics-0.16.2.0-LfIwroNJuQDMt3pStkU86) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-prof(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6)"

inherit rpm
