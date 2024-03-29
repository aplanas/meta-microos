SUMMARY = "Kernel firmware files for Intel wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-iwlwifi-20230829-1.1.noarch.rpm"
RPM_HASH = "055aa4ff654cabbb2762f5712223a55b06bb5b68bc2d2d6437b71eddfa798cd0da6531ad8a5e89800676b5f9484d566560722c2d90708a3937242a4d79cb7c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-iwlwifi-100-5.ucode \
firmware-iwlwifi-1000-5.ucode \
firmware-iwlwifi-105-6.ucode \
firmware-iwlwifi-135-6.ucode \
firmware-iwlwifi-2000-6.ucode \
firmware-iwlwifi-2030-6.ucode \
firmware-iwlwifi-3160-17.ucode \
firmware-iwlwifi-3168-29.ucode \
firmware-iwlwifi-3945-2.ucode \
firmware-iwlwifi-4965-2.ucode \
firmware-iwlwifi-5000-5.ucode \
firmware-iwlwifi-5150-2.ucode \
firmware-iwlwifi-6000-4.ucode \
firmware-iwlwifi-6000g2a-6.ucode \
firmware-iwlwifi-6000g2b-6.ucode \
firmware-iwlwifi-6050-5.ucode \
firmware-iwlwifi-7260-17.ucode \
firmware-iwlwifi-7265-17.ucode \
firmware-iwlwifi-7265D-29.ucode \
firmware-iwlwifi-8000C-34.ucode \
firmware-iwlwifi-8000C-36.ucode \
firmware-iwlwifi-8265-34.ucode \
firmware-iwlwifi-8265-36.ucode \
firmware-iwlwifi-9000-pu-b0-jf-b0-34.ucode \
firmware-iwlwifi-9000-pu-b0-jf-b0-38.ucode \
firmware-iwlwifi-9000-pu-b0-jf-b0-46.ucode \
firmware-iwlwifi-9260-th-b0-jf-b0-34.ucode \
firmware-iwlwifi-9260-th-b0-jf-b0-38.ucode \
firmware-iwlwifi-9260-th-b0-jf-b0-46.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-50.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-59.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-66.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-72.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-73.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-74.ucode \
firmware-iwlwifi-Qu-b0-hr-b0-77.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-50.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-59.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-66.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-72.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-73.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-74.ucode \
firmware-iwlwifi-Qu-b0-jf-b0-77.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-50.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-59.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-66.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-72.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-73.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-74.ucode \
firmware-iwlwifi-Qu-c0-hr-b0-77.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-50.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-59.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-66.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-72.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-73.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-74.ucode \
firmware-iwlwifi-Qu-c0-jf-b0-77.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-50.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-59.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-66.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-72.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-73.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-74.ucode \
firmware-iwlwifi-QuZ-a0-hr-b0-77.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-50.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-59.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-66.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-72.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-73.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-74.ucode \
firmware-iwlwifi-QuZ-a0-jf-b0-77.ucode \
firmware-iwlwifi-cc-a0-50.ucode \
firmware-iwlwifi-cc-a0-59.ucode \
firmware-iwlwifi-cc-a0-66.ucode \
firmware-iwlwifi-cc-a0-72.ucode \
firmware-iwlwifi-cc-a0-73.ucode \
firmware-iwlwifi-cc-a0-74.ucode \
firmware-iwlwifi-cc-a0-77.ucode \
firmware-iwlwifi-so-a0-gf-a0-72.ucode \
firmware-iwlwifi-so-a0-gf-a0-73.ucode \
firmware-iwlwifi-so-a0-gf-a0-74.ucode \
firmware-iwlwifi-so-a0-gf-a0-77.ucode \
firmware-iwlwifi-so-a0-gf-a0-78.ucode \
firmware-iwlwifi-so-a0-gf-a0-79.ucode \
firmware-iwlwifi-so-a0-gf-a0-81.ucode \
firmware-iwlwifi-so-a0-gf-a0-83.ucode \
firmware-iwlwifi-so-a0-gf-a0.pnvm \
firmware-iwlwifi-so-a0-gf4-a0-72.ucode \
firmware-iwlwifi-so-a0-gf4-a0-73.ucode \
firmware-iwlwifi-so-a0-gf4-a0-74.ucode \
firmware-iwlwifi-so-a0-gf4-a0-77.ucode \
firmware-iwlwifi-so-a0-gf4-a0-78.ucode \
firmware-iwlwifi-so-a0-gf4-a0-79.ucode \
firmware-iwlwifi-so-a0-gf4-a0-81.ucode \
firmware-iwlwifi-so-a0-gf4-a0-83.ucode \
firmware-iwlwifi-so-a0-gf4-a0.pnvm \
firmware-iwlwifi-so-a0-hr-b0-72.ucode \
firmware-iwlwifi-so-a0-hr-b0-73.ucode \
firmware-iwlwifi-so-a0-hr-b0-74.ucode \
firmware-iwlwifi-so-a0-hr-b0-77.ucode \
firmware-iwlwifi-so-a0-hr-b0-79.ucode \
firmware-iwlwifi-so-a0-hr-b0-81.ucode \
firmware-iwlwifi-so-a0-jf-b0-72.ucode \
firmware-iwlwifi-so-a0-jf-b0-73.ucode \
firmware-iwlwifi-so-a0-jf-b0-74.ucode \
firmware-iwlwifi-so-a0-jf-b0-77.ucode \
firmware-iwlwifi-ty-a0-gf-a0-59.ucode \
firmware-iwlwifi-ty-a0-gf-a0-66.ucode \
firmware-iwlwifi-ty-a0-gf-a0-72.ucode \
firmware-iwlwifi-ty-a0-gf-a0-73.ucode \
firmware-iwlwifi-ty-a0-gf-a0-74.ucode \
firmware-iwlwifi-ty-a0-gf-a0-77.ucode \
firmware-iwlwifi-ty-a0-gf-a0-78.ucode \
firmware-iwlwifi-ty-a0-gf-a0-79.ucode \
firmware-iwlwifi-ty-a0-gf-a0-81.ucode \
firmware-iwlwifi-ty-a0-gf-a0-83.ucode \
firmware-iwlwifi-ty-a0-gf-a0.pnvm \
iwl100-ucode \
iwl1000-ucode \
iwl3945-ucode \
iwl4965-ucode \
iwl5000-ucode \
iwl5150-ucode \
iwl6000-ucode \
iwl6000g2-ucode \
iwl6050-ucode \
kernel-firmware-iwlwifi"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
