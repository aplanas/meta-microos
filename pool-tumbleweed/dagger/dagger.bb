SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "dagger-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "b1b33979930ca186052d9360d9a02ad6779ff489b14cb137db476fd8462a9e89e94c8c548f7f670da2163c9edbec09e82602b8b2896fdc9e928f858ea2c804c9"

RPROVIDES:${PN} += "dagger \
dagger(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
