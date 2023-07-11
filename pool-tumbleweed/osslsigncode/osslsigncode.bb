SUMMARY = "Platform-independent tool for Authenticode signing of EXE/CAB files"
DESCRIPTION = "osslsigncode is a small utility for placing signatures on Microsoft cabinate \
files and executables."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "osslsigncode-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "54604228e26433d4a496c4917d346e34318f0c95244959f58190c2e944549b266425652666f0156d923751b899930c33d9b961985cddbbf4c7ba15196c055b5c"

RPROVIDES:${PN} += "osslsigncode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4"

inherit rpm
