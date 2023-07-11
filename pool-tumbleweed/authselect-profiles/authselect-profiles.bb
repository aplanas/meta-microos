SUMMARY = "Authentication configuration profiles"
DESCRIPTION = "This package contains the configuration profiles offered by authselect to \
allow users to configure authentication on the system."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-profiles-1.4.0+git.0.2c30265-3.3.noarch.rpm"
RPM_HASH = "b0fd4ecfc95a3c7fa200ab12db538e4c9c5d48aea6a5ab3df336a7efa165c4b783b89ec2da925a562f751653ba95b22694b9ced0fbf22899e106c0dbec807fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "authselect-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
findutils \
gawk \
grep \
pam \
sed \
systemd"

inherit rpm
