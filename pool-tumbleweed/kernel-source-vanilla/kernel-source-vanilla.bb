SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-source-vanilla-6.4.11-1.2.noarch.rpm"
RPM_HASH = "35a323fc1cdcc35d98ef62578ab6ada96c58521944ec8a7ebe16ad964b8581207d054ff70b1b46994d41bf551e66ec199c886fb55b6d33c92de344d11ddb2aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
