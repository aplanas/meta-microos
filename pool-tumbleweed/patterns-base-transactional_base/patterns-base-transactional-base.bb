SUMMARY = "Transactional Base System"
DESCRIPTION = "This is the base system for a host updated by Transactional Updates. Includes Tools for systems with a read-only root filesystem."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-transactional_base-20200505-42.1.aarch64.rpm"
RPM_HASH = "4642e9a4eb22d78b3e5d383b4159307348530068af65dda1d966c481b032e0be3a19fb9dd6465f83d0af7619bd65d6819e61edc2ededbde2bda95f1bb653a380"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-base-transactional-base"

RDEPENDS:${PN} += "microos-tools \
pattern- \
read-only-root-fs \
rebootmgr \
systemd-presets-branding-transactional-server \
transactional-update \
transactional-update-zypp-config"

inherit rpm
