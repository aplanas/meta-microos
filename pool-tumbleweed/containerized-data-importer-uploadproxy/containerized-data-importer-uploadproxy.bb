SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadproxy-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "c2c3a76c84ff0f5bca357078b3284de6acf36214059b2f85d6434dcdd813656f904f163c45aef1e8dd51075cbffc940be3685c430ba2a41d9dfd46b13089abec"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
