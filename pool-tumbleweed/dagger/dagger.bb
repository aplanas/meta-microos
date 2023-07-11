SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.6.3"

RPM_NAME = "dagger-0.6.3-1.1.aarch64.rpm"
RPM_HASH = "087834ff5f552797d194a85ea33e7f665c4e208f9a24236e124dc12f16b84407d047c82b2f7388a8f45d1976fd55e700d322250dbea54a34e4bd9bb3acf77b98"

RPROVIDES:${PN} += "dagger"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
