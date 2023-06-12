SUMMARY = "Host Name Resolution Via Multicast DNS (Zeroconf) for glibc"
DESCRIPTION = "nss-mdns is a plug-in for the GNU Name Service Switch (NSS) \
functionality of the GNU C Library (glibc) providing a hostname \
resolution via Multicast DNS (aka Zeroconf, aka Apple Rendezvous, aka \
Apple Bonjour), and effectively allowing name resolution by common \
Unix/Linux programs in the ad-hoc mDNS domain .local. \
 \
nss-mdns provides only client functionality, which means that you have \
to run a mDNS responder daemon separately from nss-mdns if you want to \
register the local hostname via mDNS. I recommend Avahi. \
 \
By default, nss-mdns tries to contact a running avahi-daemon to resolve \
hostnames and addresses and makes use of its superior record cacheing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.1"

RPM_NAME = "nss-mdns-0.15.1-1.2.aarch64.rpm"
RPM_HASH = "6c46a2a6a1a0848bcb718d093b25e5ac842a3a7b3187a125cde1775acb8d7991d14fa03031abc687950b513bd95a8ebaae65a16a7b37061000c0490de206a491"

RPROVIDES:${PN} += "libnss_mdns.so.2()(64bit) \
libnss_mdns.so.2(NSSMDNS_0)(64bit) \
libnss_mdns4.so.2()(64bit) \
libnss_mdns4.so.2(NSSMDNS_0)(64bit) \
libnss_mdns4_minimal.so.2()(64bit) \
libnss_mdns4_minimal.so.2(NSSMDNS_0)(64bit) \
libnss_mdns6.so.2()(64bit) \
libnss_mdns6.so.2(NSSMDNS_0)(64bit) \
libnss_mdns6_minimal.so.2()(64bit) \
libnss_mdns6_minimal.so.2(NSSMDNS_0)(64bit) \
libnss_mdns_minimal.so.2()(64bit) \
libnss_mdns_minimal.so.2(NSSMDNS_0)(64bit) \
nss-mdns \
nss-mdns(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
avahi \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
sed"

inherit rpm
