SUMMARY = "Transactional Base System"
DESCRIPTION = "This is the base system for a host updated by Transactional Updates. Includes Tools for systems with a read-only root filesystem."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-transactional_base-20200505-41.1.aarch64.rpm"
RPM_HASH = "961975eaae231ff43a266d506d65e466a4e3200a4f32ed3a94ea3021d45b7f91d6199a151b7caf754a34d991d1b431aa4195d9963bf80d93fb9e60069296c444"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-base-transactional_base \
patterns-base-transactional_base(aarch-64)"
RDEPENDS:${PN} += "microos-tools \
pattern() \
read-only-root-fs \
rebootmgr \
systemd-presets-branding-transactional-server \
transactional-update \
transactional-update-zypp-config"

inherit rpm
