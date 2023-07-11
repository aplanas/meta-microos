SUMMARY = "Easily and securely send things from one computer to another"
DESCRIPTION = "croc could easily and securely send things from one computer to another."
LICENSE = "MIT"

PV = "9.6.5"

RPM_NAME = "croc-9.6.5-1.1.aarch64.rpm"
RPM_HASH = "bb6ef2285e981f4bbf2990ad134b04a78e3fa942a1e525b1daceb3f10aae5ca93d8935c86bb30ffd6c7f0a7d80731e2910babefdbd4616ec33509a3660df9ef8"

RPROVIDES:${PN} += "croc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
