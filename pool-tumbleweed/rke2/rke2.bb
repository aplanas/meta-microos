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

PV = "1.27.3+rke2r1"

RPM_NAME = "rke2-1.27.3+rke2r1-1.1.aarch64.rpm"
RPM_HASH = "13efa9786745645cc89b47e5b84c32d5ef6eab6ba892e6b2b7900b9ab083bddc0cd94cb8f3df85a85f8b5c698879bc22fa0ef6c88f0ee931d3ca86713a462bef"

RPROVIDES:${PN} += "rke2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
