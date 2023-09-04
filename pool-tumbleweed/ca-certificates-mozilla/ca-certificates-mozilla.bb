SUMMARY = "CA certificates for OpenSSL"
DESCRIPTION = "This package contains some CA root certificates for OpenSSL extracted \
from MozillaFirefox"
LICENSE = "MPL-2.0"

PV = "2.62"

RPM_NAME = "ca-certificates-mozilla-2.62-2.1.noarch.rpm"
RPM_HASH = "5e3270639f14fe3cbc34c24279b738e6abcf367b1e540ca01ffff6861f9b7b9fce02519b948b61afd8ff48945695bae8b5ff6aa2adb3b8ee8543e7cebad9eb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates"

inherit rpm
