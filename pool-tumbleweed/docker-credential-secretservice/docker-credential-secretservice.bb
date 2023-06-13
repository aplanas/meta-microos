SUMMARY = "Leverage Docker credentials with libsecret"
DESCRIPTION = "Docker by default uses base64 to store the credentials for the different \
registries. This behavior can be changed by leveraging the credentials storage \
to this program, which uses libsecret in Linux."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "docker-credential-secretservice-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "97234e1cf0cc7d64b370698afb952b10727dd4c3443ce0e25621d5725af8dc3bf7737fd805e942f6550e607db1a77780ac645d662d0bc7fe4209f497c9765d5c"

RPROVIDES:${PN} += "config(docker-credential-secretservice) \
docker-credential-secretservice \
docker-credential-secretservice(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
systemd"

inherit rpm
