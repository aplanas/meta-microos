SUMMARY = "System-level performance monitoring and performance management"
DESCRIPTION = "Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The PCP open source release provides a unifying abstraction for all of \
the interesting performance data in a system, and allows client \
applications to easily retrieve and process any subset of that data."
LICENSE = "GPL-2.0+ & LGPL-2.0+ & CC-BY-SA-3.0"

PV = "5.2.5"

RPM_NAME = "pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "e655ccb97f2291a7b2e1b6ec63c2c2ec00791af43b9f9881defb7d8126ab10b659bd6572479fe796a284a39a2266a8b7f90cca36b00d0e544bc88a401b791b2b"

RPROVIDES:${PN} += "config(pcp) \
pcp \
pcp(aarch-64) \
pcp-pmda-kvm \
pcp-webapi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/hostname \
bash \
cpp \
cyrus-sasl \
fileutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.10)(64bit) \
libpcp.so.3(PCP_3.11)(64bit) \
libpcp.so.3(PCP_3.12)(64bit) \
libpcp.so.3(PCP_3.13)(64bit) \
libpcp.so.3(PCP_3.14)(64bit) \
libpcp.so.3(PCP_3.15)(64bit) \
libpcp.so.3(PCP_3.16)(64bit) \
libpcp.so.3(PCP_3.19)(64bit) \
libpcp.so.3(PCP_3.2)(64bit) \
libpcp.so.3(PCP_3.20)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.24)(64bit) \
libpcp.so.3(PCP_3.25)(64bit) \
libpcp.so.3(PCP_3.28)(64bit) \
libpcp.so.3(PCP_3.3)(64bit) \
libpcp.so.3(PCP_3.30)(64bit) \
libpcp.so.3(PCP_3.4)(64bit) \
libpcp.so.3(PCP_3.5)(64bit) \
libpcp.so.3(PCP_3.6)(64bit) \
libpcp.so.3(PCP_3.7)(64bit) \
libpcp.so.3(PCP_3.9)(64bit) \
libpcp3 \
libpcp_gui.so.2()(64bit) \
libpcp_gui.so.2(PCP_GUI_2.0)(64bit) \
libpcp_import.so.1()(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.2)(64bit) \
libpcp_mmv.so.1()(64bit) \
libpcp_mmv.so.1(PCP_MMV_1.0)(64bit) \
libpcp_mmv.so.1(PCP_MMV_1.2)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.10)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.4)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.5)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.6)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) \
libpcp_trace.so.2()(64bit) \
libpcp_trace.so.2(PCP_TRACE_2.0)(64bit) \
libpcp_web.so.1()(64bit) \
libpcp_web.so.1(PCP_WEB_1.10)(64bit) \
libpcp_web.so.1(PCP_WEB_1.11)(64bit) \
libpcp_web.so.1(PCP_WEB_1.12)(64bit) \
libpcp_web.so.1(PCP_WEB_1.13)(64bit) \
libpcp_web.so.1(PCP_WEB_1.14)(64bit) \
libpcp_web.so.1(PCP_WEB_1.15)(64bit) \
libpcp_web.so.1(PCP_WEB_1.2)(64bit) \
libpcp_web.so.1(PCP_WEB_1.3)(64bit) \
libpcp_web.so.1(PCP_WEB_1.4)(64bit) \
libpcp_web.so.1(PCP_WEB_1.5)(64bit) \
libpcp_web.so.1(PCP_WEB_1.6)(64bit) \
libpcp_web.so.1(PCP_WEB_1.8)(64bit) \
libpcp_web.so.1(PCP_WEB_1.9)(64bit) \
libreadline.so.8()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libuv.so.1()(64bit) \
perl \
permissions \
sed \
systemd \
which"

inherit rpm
