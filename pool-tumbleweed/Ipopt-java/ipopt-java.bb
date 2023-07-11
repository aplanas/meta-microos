SUMMARY = "Java bindings for Ipopt"
DESCRIPTION = "This package provides the java bindings for Ipopt in a jar file."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "Ipopt-java-3.14.12-1.2.noarch.rpm"
RPM_HASH = "0446ed39c6a761821cfd5b3cd9900f5e1e5a54911af98d4ee3693f8a399f478d003a1ccc768db7a04a003ac45c5f3eb7fc4f6cfa894d3f8fd83841c74440d065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Ipopt-java"

RDEPENDS:${PN} += ""

inherit rpm
