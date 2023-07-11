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

RPM_NAME = "libopen_amp0-2020.01-1.13.aarch64.rpm"
RPM_HASH = "103c62cc4da868b3fded1d8b3edfb672078341f30be99f2cd2243ffd89538ca13f84257f6f53f118361a7160fb2649647a060f4e905b82f3bc678a2984c41534"

RPROVIDES:${PN} += "libopen-amp.so.0 \
libopen-amp0 \
openamp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetal.so.0"

inherit rpm
