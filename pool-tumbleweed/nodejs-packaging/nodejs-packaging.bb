SUMMARY = "Node.js Dependency generators for openSUSE"
DESCRIPTION = "This package generates Node.js Provides/Requires dependencies \
automatically for nodejs module packages in openSUSE."
LICENSE = "MIT"

PV = "10.beta11"

RPM_NAME = "nodejs-packaging-10.beta11-4.2.noarch.rpm"
RPM_HASH = "a3ab44bea35feba8028e3cb54251ac6c778604abd99eb1e5c884d154969decf026033dc8b05a360343aecdeb4f7ca8794adf606502c357dbf161c6e704495ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-packaging \
rpm-macro-nodejs-build \
rpm-macro-nodejs-check \
rpm-macro-nodejs-clean \
rpm-macro-nodejs-copy \
rpm-macro-nodejs-default-filter \
rpm-macro-nodejs-filelist \
rpm-macro-nodejs-find-provides-and-requires \
rpm-macro-nodejs-fixdep \
rpm-macro-nodejs-install \
rpm-macro-nodejs-mkdir \
rpm-macro-nodejs-modulesdir \
rpm-macro-nodejs-prep \
rpm-macro-nodejs-sitearch \
rpm-macro-nodejs-sitelib \
rpm-macro-nodejs-symlink-deps \
rpm-macro-nodejs-version"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby \
gcc-c++ \
nodejs-devel \
npm \
ruby \
rubygem-json"

inherit rpm
