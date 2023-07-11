SUMMARY = "Leverage Docker credentials with libsecret"
DESCRIPTION = "Docker by default uses base64 to store the credentials for the different \
registries. This behavior can be changed by leveraging the credentials storage \
to this program, which uses libsecret in Linux."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "docker-credential-secretservice-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "f8afab3d38b3200f47fef1b857ac80b2b35b1e32365fefe2ee0961239fddd6d083e7f6b8b5657a49b6ad56e216e78929c8e813abd04f32966df504a61740cef4"

RPROVIDES:${PN} += "config-docker-credential-secretservice \
docker-credential-secretservice"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
systemd"

inherit rpm
