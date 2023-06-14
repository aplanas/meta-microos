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

PV = "1.25.4+rke2r1"

RPM_NAME = "rke2-1.25.4+rke2r1-1.4.aarch64.rpm"
RPM_HASH = "c855e9c00c2c3c773eb2ffbd44a2591cdb8f14bd232baa3d78395a40ce4b9deda852f59506e17348ca734619ba416111031565b97aa144e5b1fc2864736f686f"

RPROVIDES:${PN} += "rke2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
