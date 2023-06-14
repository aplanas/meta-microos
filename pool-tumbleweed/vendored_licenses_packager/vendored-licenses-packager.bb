SUMMARY = "Script to package legal files of vendored sources"
DESCRIPTION = "This bash script with RPM macros may help packagers to include \
some legal files of vendored dependencies."
LICENSE = "EUPL-1.2"

PV = "0.1.0"

RPM_NAME = "vendored_licenses_packager-0.1.0-1.5.noarch.rpm"
RPM_HASH = "9ad22e188a32993eb1ef4656415751665626fc70c6e9595efa274a6f924073dc7f95de39f2f8eabfc1387f57fec3627322113052aea4d0446f857ce244e9ac96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro--set-dir-vendored-source-global \
rpm-macro--set-dir-vendored-sources \
rpm-macro--set-dir-vendored-target \
rpm-macro--set-dir-vendored-target-global \
rpm-macro--set-global-vendor-source-dir \
rpm-macro--set-global-vendor-target-dir \
rpm-macro--set-tmp-licenses-vendored-dir \
rpm-macro--tmp-licenses-dir \
rpm-macro-set-dir-vendored-source \
rpm-macro-set-dir-vendored-target \
rpm-macro-vendored-licenses-packager-files \
rpm-macro-vendored-licenses-packager-files-with-higher-dirs \
rpm-macro-vendored-licenses-packager-install \
rpm-macro-vendored-licenses-packager-prep \
vendored-licenses-packager"

RDEPENDS:${PN} += "/bin/bash \
bash \
coreutils \
findutils"

inherit rpm
