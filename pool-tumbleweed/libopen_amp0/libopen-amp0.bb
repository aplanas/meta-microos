SUMMARY = "OpenAMP communication APIs"
DESCRIPTION = "The OpenAMP framework provides software components that enable development \
of software applications for Asymmetric Multiprocessing (AMP) systems. \
The framework provides the following key capabilities. \
 \
1. Provides Life Cycle Management, and Inter Processor Communication \
   capabilities for management of remote compute resources and their associated \
   software contexts. \
2. Provides a stand alone library usable with RTOS and Baremetal software \
   environments \
3. Compatibility with upstream Linux remoteproc and rpmsg components \
4. Following AMP configurations supported \
	a. Linux master/Generic(Baremetal) remote \
	b. Generic(Baremetal) master/Linux remote \
5. Proxy infrastructure and supplied demos showcase ability of proxy on master \
   to handle printf, scanf, open, close, read, write calls from Bare metal \
   based remote contexts."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "libopen_amp0-2020.01-1.12.aarch64.rpm"
RPM_HASH = "6fa8f74b71b7fcac62f5b1930768a7fadd207f7eb289ffe0b448f4d588b35dbaa3c9ff51762df7283f59e1b038e1f0bb3c5a081ee276e34a4fbdabb395f05f9a"

RPROVIDES:${PN} += "libopen-amp.so.0 \
libopen-amp0 \
openamp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetal.so.0"

inherit rpm
