SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE2, also known as RKE Government, is Rancher's next-generation Kubernetes distribution. \
It is a fully conformant Kubernetes distribution that focuses on security and compliance within the U.S. Federal Government sector. \
 \
To meet these goals, RKE2 does the following: \
    Provides defaults and configuration options that allow clusters to pass the CIS Kubernetes Benchmark with minimal operator intervention \
    Enables FIPS 140-2 compliance \
    Supports SELinux policy and Multi-Category Security (MCS) label enforcement \
    Regularly scans components for CVEs using trivy in our build pipeline"
LICENSE = "Apache-2.0"

PV = "1.27.4+rke2r1"

RPM_NAME = "rke2-1.27.4+rke2r1-1.1.aarch64.rpm"
RPM_HASH = "7d17e462f5d037ecadc315037ebe0d8dc51f9d6414bf98ffb623d47e1e3bb03ca8d114f5684693633bcb1155e7e89bb42cfcccfff0cb43a38157f72c6818b43d"

RPROVIDES:${PN} += "rke2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
