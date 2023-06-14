SUMMARY = "Open a shell inside a running container"
DESCRIPTION = "This utility allows you to run a shell, and use diagnostic \
utilities, inside an already running container. The main \
purpose of this is problem diagnosis."
LICENSE = "GPL-2.0"

PV = "0.2.2"

RPM_NAME = "container-support-utils-0.2.2-1.12.aarch64.rpm"
RPM_HASH = "363f7fcbc91b6e4ee06bf9d0f3bad40fbafd82e81020564a42793a54dc40aaa3f212d1b3977ed1c5ca5cc52a42aca8584b65f556c943b93d25d915b8b8b61b94"

RPROVIDES:${PN} += "container-support-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
