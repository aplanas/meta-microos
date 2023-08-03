SUMMARY = "Kernel firmware files for Intel i915 graphics driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel i915 graphics driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-i915-20230724-1.1.noarch.rpm"
RPM_HASH = "735132d2e8fee201fbd8684e22436ea2adc90ef0b1a6e764c5f90bdd33091a113a1e2cf300c239f939c40528731fc0bbe0aed1878c6be9209e30e13de8ac458f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-i915/adlp-dmc-ver2-09.bin \
firmware-i915/adlp-dmc-ver2-10.bin \
firmware-i915/adlp-dmc-ver2-12.bin \
firmware-i915/adlp-dmc-ver2-14.bin \
firmware-i915/adlp-dmc-ver2-16.bin \
firmware-i915/adlp-dmc.bin \
firmware-i915/adlp-guc-62.0.3.bin \
firmware-i915/adlp-guc-69.0.3.bin \
firmware-i915/adlp-guc-70.1.1.bin \
firmware-i915/adlp-guc-70.bin \
firmware-i915/adls-dmc-ver2-01.bin \
firmware-i915/bxt-dmc-ver1-07.bin \
firmware-i915/bxt-dmc-ver1.bin \
firmware-i915/bxt-guc-32.0.3.bin \
firmware-i915/bxt-guc-33.0.0.bin \
firmware-i915/bxt-guc-49.0.1.bin \
firmware-i915/bxt-guc-62.0.0.bin \
firmware-i915/bxt-guc-69.0.3.bin \
firmware-i915/bxt-guc-70.1.1.bin \
firmware-i915/bxt-guc-ver8-7.bin \
firmware-i915/bxt-guc-ver9-29.bin \
firmware-i915/bxt-huc-2.0.0.bin \
firmware-i915/bxt-huc-ver01-07-1398.bin \
firmware-i915/bxt-huc-ver01-8-2893.bin \
firmware-i915/cml-guc-33.0.0.bin \
firmware-i915/cml-guc-49.0.1.bin \
firmware-i915/cml-guc-62.0.0.bin \
firmware-i915/cml-guc-69.0.3.bin \
firmware-i915/cml-guc-70.1.1.bin \
firmware-i915/cml-huc-4.0.0.bin \
firmware-i915/cnl-dmc-ver1-06.bin \
firmware-i915/cnl-dmc-ver1-07.bin \
firmware-i915/dg1-dmc-ver2-02.bin \
firmware-i915/dg1-guc-49.0.1.bin \
firmware-i915/dg1-guc-62.0.0.bin \
firmware-i915/dg1-guc-69.0.3.bin \
firmware-i915/dg1-guc-70.1.1.bin \
firmware-i915/dg1-guc-70.bin \
firmware-i915/dg1-huc-7.7.1.bin \
firmware-i915/dg1-huc-7.9.3.bin \
firmware-i915/dg1-huc.bin \
firmware-i915/dg2-dmc-ver2-06.bin \
firmware-i915/dg2-dmc-ver2-07.bin \
firmware-i915/dg2-dmc-ver2-08.bin \
firmware-i915/dg2-guc-70.1.2.bin \
firmware-i915/dg2-guc-70.4.1.bin \
firmware-i915/dg2-guc-70.bin \
firmware-i915/dg2-huc-gsc.bin \
firmware-i915/ehl-guc-33.0.4.bin \
firmware-i915/ehl-guc-49.0.1.bin \
firmware-i915/ehl-guc-62.0.0.bin \
firmware-i915/ehl-guc-69.0.3.bin \
firmware-i915/ehl-guc-70.1.1.bin \
firmware-i915/ehl-huc-9.0.0.bin \
firmware-i915/glk-dmc-ver1-04.bin \
firmware-i915/glk-guc-32.0.3.bin \
firmware-i915/glk-guc-33.0.0.bin \
firmware-i915/glk-guc-49.0.1.bin \
firmware-i915/glk-guc-62.0.0.bin \
firmware-i915/glk-guc-69.0.3.bin \
firmware-i915/glk-guc-70.1.1.bin \
firmware-i915/glk-huc-4.0.0.bin \
firmware-i915/glk-huc-ver03-01-2893.bin \
firmware-i915/icl-dmc-ver1-07.bin \
firmware-i915/icl-dmc-ver1-09.bin \
firmware-i915/icl-guc-32.0.3.bin \
firmware-i915/icl-guc-33.0.0.bin \
firmware-i915/icl-guc-49.0.1.bin \
firmware-i915/icl-guc-62.0.0.bin \
firmware-i915/icl-guc-69.0.3.bin \
firmware-i915/icl-guc-70.1.1.bin \
firmware-i915/icl-huc-9.0.0.bin \
firmware-i915/icl-huc-ver8-4-3238.bin \
firmware-i915/kbl-dmc-ver1-01.bin \
firmware-i915/kbl-dmc-ver1-04.bin \
firmware-i915/kbl-dmc-ver1.bin \
firmware-i915/kbl-guc-32.0.3.bin \
firmware-i915/kbl-guc-33.0.0.bin \
firmware-i915/kbl-guc-49.0.1.bin \
firmware-i915/kbl-guc-62.0.0.bin \
firmware-i915/kbl-guc-69.0.3.bin \
firmware-i915/kbl-guc-70.1.1.bin \
firmware-i915/kbl-guc-ver9-14.bin \
firmware-i915/kbl-guc-ver9-39.bin \
firmware-i915/kbl-huc-4.0.0.bin \
firmware-i915/kbl-huc-ver02-00-1810.bin \
firmware-i915/mtl-dmc-ver2-10.bin \
firmware-i915/mtl-dmc.bin \
firmware-i915/mtl-guc-70.bin \
firmware-i915/mtl-huc-gsc.bin \
firmware-i915/rkl-dmc-ver2-02.bin \
firmware-i915/rkl-dmc-ver2-03.bin \
firmware-i915/skl-dmc-ver1-23.bin \
firmware-i915/skl-dmc-ver1-26.bin \
firmware-i915/skl-dmc-ver1-27.bin \
firmware-i915/skl-dmc-ver1.bin \
firmware-i915/skl-guc-32.0.3.bin \
firmware-i915/skl-guc-33.0.0.bin \
firmware-i915/skl-guc-49.0.1.bin \
firmware-i915/skl-guc-62.0.0.bin \
firmware-i915/skl-guc-69.0.3.bin \
firmware-i915/skl-guc-70.1.1.bin \
firmware-i915/skl-guc-ver1.bin \
firmware-i915/skl-guc-ver4.bin \
firmware-i915/skl-guc-ver6-1.bin \
firmware-i915/skl-guc-ver6.bin \
firmware-i915/skl-guc-ver9-33.bin \
firmware-i915/skl-huc-2.0.0.bin \
firmware-i915/skl-huc-ver01-07-1398.bin \
firmware-i915/tgl-dmc-ver2-04.bin \
firmware-i915/tgl-dmc-ver2-06.bin \
firmware-i915/tgl-dmc-ver2-08.bin \
firmware-i915/tgl-dmc-ver2-12.bin \
firmware-i915/tgl-guc-35.2.0.bin \
firmware-i915/tgl-guc-49.0.1.bin \
firmware-i915/tgl-guc-62.0.0.bin \
firmware-i915/tgl-guc-69.0.3.bin \
firmware-i915/tgl-guc-70.1.1.bin \
firmware-i915/tgl-guc-70.bin \
firmware-i915/tgl-huc-7.0.12.bin \
firmware-i915/tgl-huc-7.0.3.bin \
firmware-i915/tgl-huc-7.5.0.bin \
firmware-i915/tgl-huc-7.9.3.bin \
firmware-i915/tgl-huc.bin \
kernel-firmware-i915"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
