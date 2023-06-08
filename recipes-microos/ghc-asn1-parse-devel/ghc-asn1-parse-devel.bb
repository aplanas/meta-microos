SUMMARY = "Haskell asn1-parse library development files"
DESCRIPTION = "This package provides the Haskell asn1-parse library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-devel-0.9.5-6.2.aarch64.rpm"
RPM_HASH = "57d96fc4985ab6d0f2b92f1413f9227f3ad79b25781494417870ff416b3b3dd037d8d6c09895af33929b3afa8a3e11afa0cd7d3bbaf9c4ed90d06dc53dc9ad79"

RPROVIDES:${PN} += "ghc-asn1-parse-devel ghc-asn1-parse-devel(aarch-64) ghc-devel(asn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV)"
RDEPENDS:${PN} += "/bin/sh ghc-asn1-parse ghc-compiler ghc-devel(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0)"

inherit rpm
