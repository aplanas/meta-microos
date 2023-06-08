SUMMARY = "Leverage Docker credentials with libsecret"
DESCRIPTION = "Docker by default uses base64 to store the credentials for the different \
registries. This behavior can be changed by leveraging the credentials storage \
to this program, which uses libsecret in Linux."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "docker-credential-secretservice-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "2ab991054d3ff8f88093d0d34b244d3ee2f9833722da6e8bcbd1469a409ec59389309a2d834ed8654f20940c8da29ea24392afb19a2951e33ed16d1d7ad83852"

RPROVIDES:${PN} += "config(docker-credential-secretservice) docker-credential-secretservice docker-credential-secretservice(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsecret-1.so.0()(64bit) systemd"

inherit rpm
