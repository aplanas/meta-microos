SUMMARY = "Command line utility which encodes and decodes files in this format"
DESCRIPTION = "qprint is a command line utility which encodes and decodes files in this format. It can be used within a pipeline as an encoding or decoding filter, and is most commonly used in this manner as part of an automated mail processing system. With appropriate options, qprint can encode pure binary files, but it's a poor choice since it may inflate the size of the file by as much as a factor of three. The base64 MIME encoding is a better choice for such data."
LICENSE = "SUSE-Public-Domain"

PV = "1.1"

RPM_NAME = "qprint-1.1-1.25.aarch64.rpm"
RPM_HASH = "bc5b290c5bdf082a84a5c3fe225c983f47bd83dc7c7ef07e0fc6928e4b4e70dc593da3410a852a0506bf87fe660ea67942569c370304d6650a73bad7c007caa3"

RPROVIDES:${PN} += "qprint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
