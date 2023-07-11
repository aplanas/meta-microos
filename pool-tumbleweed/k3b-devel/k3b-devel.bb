SUMMARY = "Development files for k3b"
DESCRIPTION = "This package contain files needed for development with k3b."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "k3b-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fb969d500a5caceaf34591f64c77c59622788e510444a88d6c2a2cae38b0c46ea5a46e70920840a3f45413e8d11d67a7d8f952189869254ca4ef04fd235400b8"

RPROVIDES:${PN} += "k3b-devel"

RDEPENDS:${PN} += "k3b"

inherit rpm
