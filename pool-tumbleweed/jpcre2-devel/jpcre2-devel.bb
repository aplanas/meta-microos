SUMMARY = "C++ wrapper for the PCRE2 library (header only)"
DESCRIPTION = "C++ wrapper for PCRE2 library (header only). \
Provides some C++ wrapper classes/functions to perform regex operations \
such as regex match and regex replace."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "10.32.01"

RPM_NAME = "jpcre2-devel-10.32.01-1.8.aarch64.rpm"
RPM_HASH = "90e7988cb7bbb537b494c103b7779804d1ea51f18d3cb5e0a321a2cad50358f6e67e2e8c0287951be4ab37774efaa3bca83c6057ee04832c3a3de830a811c9a0"

RPROVIDES:${PN} += "jpcre2-devel"

RDEPENDS:${PN} += ""

inherit rpm
