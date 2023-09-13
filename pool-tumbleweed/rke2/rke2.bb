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

PV = "1.27.5+rke2r1"

RPM_NAME = "rke2-1.27.5+rke2r1-1.1.aarch64.rpm"
RPM_HASH = "39a075bb74dc60be893436bf2cd5512e8ce19be504b612a2e7296a8fb29481ba0d78848aab3df6581a70ebecbafba89bd89825636be4b9636d8159a36b73ce7b"

RPROVIDES:${PN} += "rke2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
