SUMMARY = "Kernel firmware files for Radeon graphics driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Radeon graphics driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-radeon-20230829-1.1.noarch.rpm"
RPM_HASH = "09db617bfb354c51861cb9557a5f6c0f9c64b782a1ac638892ba844554224cdeda62ec1bc2e6c4a3ec89ee89d29eecae7a04f2b455da23732f7b0558dc271b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-radeon/ARUBA-me.bin \
firmware-radeon/ARUBA-pfp.bin \
firmware-radeon/ARUBA-rlc.bin \
firmware-radeon/BARTS-mc.bin \
firmware-radeon/BARTS-me.bin \
firmware-radeon/BARTS-pfp.bin \
firmware-radeon/BARTS-smc.bin \
firmware-radeon/BONAIRE-ce.bin \
firmware-radeon/BONAIRE-mc.bin \
firmware-radeon/BONAIRE-mc2.bin \
firmware-radeon/BONAIRE-me.bin \
firmware-radeon/BONAIRE-mec.bin \
firmware-radeon/BONAIRE-pfp.bin \
firmware-radeon/BONAIRE-rlc.bin \
firmware-radeon/BONAIRE-sdma.bin \
firmware-radeon/BONAIRE-smc.bin \
firmware-radeon/BONAIRE-uvd.bin \
firmware-radeon/BONAIRE-vce.bin \
firmware-radeon/BTC-rlc.bin \
firmware-radeon/CAICOS-mc.bin \
firmware-radeon/CAICOS-me.bin \
firmware-radeon/CAICOS-pfp.bin \
firmware-radeon/CAICOS-smc.bin \
firmware-radeon/CAYMAN-mc.bin \
firmware-radeon/CAYMAN-me.bin \
firmware-radeon/CAYMAN-pfp.bin \
firmware-radeon/CAYMAN-rlc.bin \
firmware-radeon/CAYMAN-smc.bin \
firmware-radeon/CEDAR-me.bin \
firmware-radeon/CEDAR-pfp.bin \
firmware-radeon/CEDAR-rlc.bin \
firmware-radeon/CEDAR-smc.bin \
firmware-radeon/CYPRESS-me.bin \
firmware-radeon/CYPRESS-pfp.bin \
firmware-radeon/CYPRESS-rlc.bin \
firmware-radeon/CYPRESS-smc.bin \
firmware-radeon/CYPRESS-uvd.bin \
firmware-radeon/HAINAN-ce.bin \
firmware-radeon/HAINAN-mc.bin \
firmware-radeon/HAINAN-mc2.bin \
firmware-radeon/HAINAN-me.bin \
firmware-radeon/HAINAN-pfp.bin \
firmware-radeon/HAINAN-rlc.bin \
firmware-radeon/HAINAN-smc.bin \
firmware-radeon/HAWAII-ce.bin \
firmware-radeon/HAWAII-mc.bin \
firmware-radeon/HAWAII-mc2.bin \
firmware-radeon/HAWAII-me.bin \
firmware-radeon/HAWAII-mec.bin \
firmware-radeon/HAWAII-pfp.bin \
firmware-radeon/HAWAII-rlc.bin \
firmware-radeon/HAWAII-sdma.bin \
firmware-radeon/HAWAII-smc.bin \
firmware-radeon/JUNIPER-me.bin \
firmware-radeon/JUNIPER-pfp.bin \
firmware-radeon/JUNIPER-rlc.bin \
firmware-radeon/JUNIPER-smc.bin \
firmware-radeon/KABINI-ce.bin \
firmware-radeon/KABINI-me.bin \
firmware-radeon/KABINI-mec.bin \
firmware-radeon/KABINI-pfp.bin \
firmware-radeon/KABINI-rlc.bin \
firmware-radeon/KABINI-sdma.bin \
firmware-radeon/KAVERI-ce.bin \
firmware-radeon/KAVERI-me.bin \
firmware-radeon/KAVERI-mec.bin \
firmware-radeon/KAVERI-pfp.bin \
firmware-radeon/KAVERI-rlc.bin \
firmware-radeon/KAVERI-sdma.bin \
firmware-radeon/MULLINS-ce.bin \
firmware-radeon/MULLINS-me.bin \
firmware-radeon/MULLINS-mec.bin \
firmware-radeon/MULLINS-pfp.bin \
firmware-radeon/MULLINS-rlc.bin \
firmware-radeon/MULLINS-sdma.bin \
firmware-radeon/OLAND-ce.bin \
firmware-radeon/OLAND-mc.bin \
firmware-radeon/OLAND-mc2.bin \
firmware-radeon/OLAND-me.bin \
firmware-radeon/OLAND-pfp.bin \
firmware-radeon/OLAND-rlc.bin \
firmware-radeon/OLAND-smc.bin \
firmware-radeon/PALM-me.bin \
firmware-radeon/PALM-pfp.bin \
firmware-radeon/PITCAIRN-ce.bin \
firmware-radeon/PITCAIRN-mc.bin \
firmware-radeon/PITCAIRN-mc2.bin \
firmware-radeon/PITCAIRN-me.bin \
firmware-radeon/PITCAIRN-pfp.bin \
firmware-radeon/PITCAIRN-rlc.bin \
firmware-radeon/PITCAIRN-smc.bin \
firmware-radeon/R100-cp.bin \
firmware-radeon/R200-cp.bin \
firmware-radeon/R300-cp.bin \
firmware-radeon/R420-cp.bin \
firmware-radeon/R520-cp.bin \
firmware-radeon/R600-me.bin \
firmware-radeon/R600-pfp.bin \
firmware-radeon/R600-rlc.bin \
firmware-radeon/R600-uvd.bin \
firmware-radeon/R700-rlc.bin \
firmware-radeon/REDWOOD-me.bin \
firmware-radeon/REDWOOD-pfp.bin \
firmware-radeon/REDWOOD-rlc.bin \
firmware-radeon/REDWOOD-smc.bin \
firmware-radeon/RS600-cp.bin \
firmware-radeon/RS690-cp.bin \
firmware-radeon/RS780-me.bin \
firmware-radeon/RS780-pfp.bin \
firmware-radeon/RS780-uvd.bin \
firmware-radeon/RV610-me.bin \
firmware-radeon/RV610-pfp.bin \
firmware-radeon/RV620-me.bin \
firmware-radeon/RV620-pfp.bin \
firmware-radeon/RV630-me.bin \
firmware-radeon/RV630-pfp.bin \
firmware-radeon/RV635-me.bin \
firmware-radeon/RV635-pfp.bin \
firmware-radeon/RV670-me.bin \
firmware-radeon/RV670-pfp.bin \
firmware-radeon/RV710-me.bin \
firmware-radeon/RV710-pfp.bin \
firmware-radeon/RV710-smc.bin \
firmware-radeon/RV710-uvd.bin \
firmware-radeon/RV730-me.bin \
firmware-radeon/RV730-pfp.bin \
firmware-radeon/RV730-smc.bin \
firmware-radeon/RV740-smc.bin \
firmware-radeon/RV770-me.bin \
firmware-radeon/RV770-pfp.bin \
firmware-radeon/RV770-smc.bin \
firmware-radeon/RV770-uvd.bin \
firmware-radeon/SUMO-me.bin \
firmware-radeon/SUMO-pfp.bin \
firmware-radeon/SUMO-rlc.bin \
firmware-radeon/SUMO-uvd.bin \
firmware-radeon/SUMO2-me.bin \
firmware-radeon/SUMO2-pfp.bin \
firmware-radeon/TAHITI-ce.bin \
firmware-radeon/TAHITI-mc.bin \
firmware-radeon/TAHITI-mc2.bin \
firmware-radeon/TAHITI-me.bin \
firmware-radeon/TAHITI-pfp.bin \
firmware-radeon/TAHITI-rlc.bin \
firmware-radeon/TAHITI-smc.bin \
firmware-radeon/TAHITI-uvd.bin \
firmware-radeon/TAHITI-vce.bin \
firmware-radeon/TURKS-mc.bin \
firmware-radeon/TURKS-me.bin \
firmware-radeon/TURKS-pfp.bin \
firmware-radeon/TURKS-smc.bin \
firmware-radeon/VERDE-ce.bin \
firmware-radeon/VERDE-mc.bin \
firmware-radeon/VERDE-mc2.bin \
firmware-radeon/VERDE-me.bin \
firmware-radeon/VERDE-pfp.bin \
firmware-radeon/VERDE-rlc.bin \
firmware-radeon/VERDE-smc.bin \
firmware-radeon/banks-k-2-smc.bin \
firmware-radeon/bonaire-ce.bin \
firmware-radeon/bonaire-k-smc.bin \
firmware-radeon/bonaire-mc.bin \
firmware-radeon/bonaire-me.bin \
firmware-radeon/bonaire-mec.bin \
firmware-radeon/bonaire-pfp.bin \
firmware-radeon/bonaire-rlc.bin \
firmware-radeon/bonaire-sdma.bin \
firmware-radeon/bonaire-sdma1.bin \
firmware-radeon/bonaire-smc.bin \
firmware-radeon/bonaire-uvd.bin \
firmware-radeon/bonaire-vce.bin \
firmware-radeon/hainan-ce.bin \
firmware-radeon/hainan-k-smc.bin \
firmware-radeon/hainan-mc.bin \
firmware-radeon/hainan-me.bin \
firmware-radeon/hainan-pfp.bin \
firmware-radeon/hainan-rlc.bin \
firmware-radeon/hainan-smc.bin \
firmware-radeon/hawaii-ce.bin \
firmware-radeon/hawaii-k-smc.bin \
firmware-radeon/hawaii-mc.bin \
firmware-radeon/hawaii-me.bin \
firmware-radeon/hawaii-mec.bin \
firmware-radeon/hawaii-pfp.bin \
firmware-radeon/hawaii-rlc.bin \
firmware-radeon/hawaii-sdma.bin \
firmware-radeon/hawaii-sdma1.bin \
firmware-radeon/hawaii-smc.bin \
firmware-radeon/hawaii-uvd.bin \
firmware-radeon/hawaii-vce.bin \
firmware-radeon/kabini-ce.bin \
firmware-radeon/kabini-me.bin \
firmware-radeon/kabini-mec.bin \
firmware-radeon/kabini-pfp.bin \
firmware-radeon/kabini-rlc.bin \
firmware-radeon/kabini-sdma.bin \
firmware-radeon/kabini-sdma1.bin \
firmware-radeon/kabini-uvd.bin \
firmware-radeon/kabini-vce.bin \
firmware-radeon/kaveri-ce.bin \
firmware-radeon/kaveri-me.bin \
firmware-radeon/kaveri-mec.bin \
firmware-radeon/kaveri-mec2.bin \
firmware-radeon/kaveri-pfp.bin \
firmware-radeon/kaveri-rlc.bin \
firmware-radeon/kaveri-sdma.bin \
firmware-radeon/kaveri-sdma1.bin \
firmware-radeon/kaveri-uvd.bin \
firmware-radeon/kaveri-vce.bin \
firmware-radeon/mullins-ce.bin \
firmware-radeon/mullins-me.bin \
firmware-radeon/mullins-mec.bin \
firmware-radeon/mullins-pfp.bin \
firmware-radeon/mullins-rlc.bin \
firmware-radeon/mullins-sdma.bin \
firmware-radeon/mullins-sdma1.bin \
firmware-radeon/mullins-uvd.bin \
firmware-radeon/mullins-vce.bin \
firmware-radeon/oland-ce.bin \
firmware-radeon/oland-k-smc.bin \
firmware-radeon/oland-mc.bin \
firmware-radeon/oland-me.bin \
firmware-radeon/oland-pfp.bin \
firmware-radeon/oland-rlc.bin \
firmware-radeon/oland-smc.bin \
firmware-radeon/pitcairn-ce.bin \
firmware-radeon/pitcairn-k-smc.bin \
firmware-radeon/pitcairn-mc.bin \
firmware-radeon/pitcairn-me.bin \
firmware-radeon/pitcairn-pfp.bin \
firmware-radeon/pitcairn-rlc.bin \
firmware-radeon/pitcairn-smc.bin \
firmware-radeon/si58-mc.bin \
firmware-radeon/tahiti-ce.bin \
firmware-radeon/tahiti-k-smc.bin \
firmware-radeon/tahiti-mc.bin \
firmware-radeon/tahiti-me.bin \
firmware-radeon/tahiti-pfp.bin \
firmware-radeon/tahiti-rlc.bin \
firmware-radeon/tahiti-smc.bin \
firmware-radeon/verde-ce.bin \
firmware-radeon/verde-k-smc.bin \
firmware-radeon/verde-mc.bin \
firmware-radeon/verde-me.bin \
firmware-radeon/verde-pfp.bin \
firmware-radeon/verde-rlc.bin \
firmware-radeon/verde-smc.bin \
kernel-firmware-radeon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
