SUMMARY = "Haskell ghc-lib-parser library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.4.20221225"

RPM_NAME = "ghc-ghc-lib-parser-devel-9.4.4.20221225-1.3.aarch64.rpm"
RPM_HASH = "3b27c2168436d5a4e6150a20d3194fe921fc161a1ad5f43997ed5ec0db54d798f8c6429188055409776d7321259cb05a92497e58700a8e2664b50ea1b9acd421"

RPROVIDES:${PN} += "ghc-devel(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb) ghc-ghc-lib-parser-devel ghc-ghc-lib-parser-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(exceptions-0.10.5) ghc-devel(filepath-1.4.2.2) ghc-devel(ghc-prim-0.9.0) ghc-devel(parsec-3.1.16.1) ghc-devel(pretty-1.1.3.6) ghc-devel(process-1.6.16.0) ghc-devel(time-1.12.2) ghc-devel(transformers-0.5.6.2) ghc-devel(unix-2.7.3) ghc-ghc-lib-parser"

inherit rpm
