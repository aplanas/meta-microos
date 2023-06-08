SUMMARY = "Icons with distribution logos"
DESCRIPTION = "Icons with openSUSE distribution logos."
LICENSE = "CC-BY-SA-4.0"

PV = "20220322"

RPM_NAME = "distribution-logos-openSUSE-icons-20220322-1.5.noarch.rpm"
RPM_HASH = "a433fa62ff63afc9bd0874b3805e9a1b04bd4dd72b188aa5eb09fa075998219858b33ee76cb065c5c7ca1593ad9f8a4d43c437c7d1ac748d9bc9ea993ae3119f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos-openSUSE-icons systemd-icon-branding systemd-icon-branding-openSUSE"
RDEPENDS:${PN} += "distribution-logos"

inherit rpm
