SUMMARY = "The Common UNIX Printing System"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
CUPS consists of a print spooler and scheduler, a filter system that \
converts the print data to a format that the printer will understand, \
and a backend system that sends this data to the print device. CUPS \
uses the Internet Printing Protocol (IPP) as the basis for managing \
print jobs and queues. It also provides the traditional command line \
interfaces for the System V and Berkeley print systems, and provides \
support for the Berkeley print system's Line Printer Daemon protocol \
and limited support for the server message block (SMB) protocol. \
 \
CUPS comes with a built-in web-based interface."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "612d6e7f53066c80d50f63c82318b1143fed0dbd9e69741abad78dbbffefadc70a7b8661da4137fcfae4601da767e095c177a2c870297c8bbb323f88eff95e0e"

RPROVIDES:${PN} += "config(cups) cups cups(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/sbin/groupadd coreutils cups-client cups-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcups.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libusb-1.0.so.0()(64bit) systemd"

inherit rpm
