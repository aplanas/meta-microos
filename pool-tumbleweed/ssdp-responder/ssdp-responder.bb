SUMMARY = "SSDP responder for Linux"
DESCRIPTION = "ssdpd is a stand-alone daemon that implements the Simple Service \
Discovery Protocol (SSDP) for use by networked Linux devices that \
want to announce themselves to systems running Windows. ssdpd has a \
built-in web server for serving the UPnP XML description which \
Windows uses to present the icon when an InternetGatewayDevice is \
announced."
LICENSE = "ISC"

PV = "2.0"

RPM_NAME = "ssdp-responder-2.0-1.3.aarch64.rpm"
RPM_HASH = "a5ff4e0652b0aea8120f4339e79c87b0823b0eb98edcb78b2305e7c9ef58ded267e8ddba445355c663a768555bad93077d18baafd74d831e1d350382c14168d8"

RPROVIDES:${PN} += "ssdp-responder"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
