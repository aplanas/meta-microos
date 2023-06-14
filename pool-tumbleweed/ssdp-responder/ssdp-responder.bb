SUMMARY = "SSDP responder for Linux"
DESCRIPTION = "ssdpd is a stand-alone daemon that implements the Simple Service \
Discovery Protocol (SSDP) for use by networked Linux devices that \
want to announce themselves to systems running Windows. ssdpd has a \
built-in web server for serving the UPnP XML description which \
Windows uses to present the icon when an InternetGatewayDevice is \
announced."
LICENSE = "ISC"

PV = "2.0"

RPM_NAME = "ssdp-responder-2.0-1.2.aarch64.rpm"
RPM_HASH = "45328b279ff9af02b5bf45bceea58cfd526112b3d2bd237313a1bfd1da14c482051eca06bdd4a28c0fe11f25128efc48c1eec22da3f0904762502f05ebf66d19"

RPROVIDES:${PN} += "ssdp-responder"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
