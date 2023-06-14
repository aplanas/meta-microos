SUMMARY = "Kernel firmware files for Nvidia Tegra and graphics drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Nvidia Tegra and graphics drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-nvidia-20230517-1.1.noarch.rpm"
RPM_HASH = "399d1e9991cd02fc4b217e41de628ca822a58846e1bf42f20ca84ed8272085c8f4def490814faf5ea484d555c755b39fd6f25a05192e71677124146ac7a4feb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-nvidia/ga102/acr/ucode-ahesasc.bin \
firmware-nvidia/ga102/acr/ucode-asb.bin \
firmware-nvidia/ga102/acr/ucode-unload.bin \
firmware-nvidia/ga102/gr/NET-img.bin \
firmware-nvidia/ga102/gr/fecs-bl.bin \
firmware-nvidia/ga102/gr/fecs-sig.bin \
firmware-nvidia/ga102/gr/gpccs-bl.bin \
firmware-nvidia/ga102/gr/gpccs-sig.bin \
firmware-nvidia/ga102/nvdec/scrubber.bin \
firmware-nvidia/ga102/sec2/desc.bin \
firmware-nvidia/ga102/sec2/hs-bl-sig.bin \
firmware-nvidia/ga102/sec2/image.bin \
firmware-nvidia/ga102/sec2/sig.bin \
firmware-nvidia/ga103/acr/ucode-ahesasc.bin \
firmware-nvidia/ga103/acr/ucode-asb.bin \
firmware-nvidia/ga103/acr/ucode-unload.bin \
firmware-nvidia/ga103/gr/NET-img.bin \
firmware-nvidia/ga103/gr/fecs-bl.bin \
firmware-nvidia/ga103/gr/fecs-sig.bin \
firmware-nvidia/ga103/gr/gpccs-bl.bin \
firmware-nvidia/ga103/gr/gpccs-sig.bin \
firmware-nvidia/ga103/nvdec/scrubber.bin \
firmware-nvidia/ga103/sec2/desc.bin \
firmware-nvidia/ga103/sec2/hs-bl-sig.bin \
firmware-nvidia/ga103/sec2/image.bin \
firmware-nvidia/ga103/sec2/sig.bin \
firmware-nvidia/ga104/acr/ucode-ahesasc.bin \
firmware-nvidia/ga104/acr/ucode-asb.bin \
firmware-nvidia/ga104/acr/ucode-unload.bin \
firmware-nvidia/ga104/gr/NET-img.bin \
firmware-nvidia/ga104/gr/fecs-bl.bin \
firmware-nvidia/ga104/gr/fecs-sig.bin \
firmware-nvidia/ga104/gr/gpccs-bl.bin \
firmware-nvidia/ga104/gr/gpccs-sig.bin \
firmware-nvidia/ga104/nvdec/scrubber.bin \
firmware-nvidia/ga104/sec2/desc.bin \
firmware-nvidia/ga104/sec2/hs-bl-sig.bin \
firmware-nvidia/ga104/sec2/image.bin \
firmware-nvidia/ga104/sec2/sig.bin \
firmware-nvidia/ga106/acr/ucode-ahesasc.bin \
firmware-nvidia/ga106/acr/ucode-asb.bin \
firmware-nvidia/ga106/acr/ucode-unload.bin \
firmware-nvidia/ga106/gr/NET-img.bin \
firmware-nvidia/ga106/gr/fecs-bl.bin \
firmware-nvidia/ga106/gr/fecs-sig.bin \
firmware-nvidia/ga106/gr/gpccs-bl.bin \
firmware-nvidia/ga106/gr/gpccs-sig.bin \
firmware-nvidia/ga106/nvdec/scrubber.bin \
firmware-nvidia/ga106/sec2/desc.bin \
firmware-nvidia/ga106/sec2/hs-bl-sig.bin \
firmware-nvidia/ga106/sec2/image.bin \
firmware-nvidia/ga106/sec2/sig.bin \
firmware-nvidia/ga107/acr/ucode-ahesasc.bin \
firmware-nvidia/ga107/acr/ucode-asb.bin \
firmware-nvidia/ga107/acr/ucode-unload.bin \
firmware-nvidia/ga107/gr/NET-img.bin \
firmware-nvidia/ga107/gr/fecs-bl.bin \
firmware-nvidia/ga107/gr/fecs-sig.bin \
firmware-nvidia/ga107/gr/gpccs-bl.bin \
firmware-nvidia/ga107/gr/gpccs-sig.bin \
firmware-nvidia/ga107/nvdec/scrubber.bin \
firmware-nvidia/ga107/sec2/desc.bin \
firmware-nvidia/ga107/sec2/hs-bl-sig.bin \
firmware-nvidia/ga107/sec2/image.bin \
firmware-nvidia/ga107/sec2/sig.bin \
firmware-nvidia/gk20a/fecs-data.bin \
firmware-nvidia/gk20a/fecs-inst.bin \
firmware-nvidia/gk20a/gpccs-data.bin \
firmware-nvidia/gk20a/gpccs-inst.bin \
firmware-nvidia/gk20a/sw-bundle-init.bin \
firmware-nvidia/gk20a/sw-ctx.bin \
firmware-nvidia/gk20a/sw-method-init.bin \
firmware-nvidia/gk20a/sw-nonctx.bin \
firmware-nvidia/gm200/acr/bl.bin \
firmware-nvidia/gm200/acr/ucode-load.bin \
firmware-nvidia/gm200/acr/ucode-unload.bin \
firmware-nvidia/gm200/gr/fecs-bl.bin \
firmware-nvidia/gm200/gr/fecs-data.bin \
firmware-nvidia/gm200/gr/fecs-inst.bin \
firmware-nvidia/gm200/gr/fecs-sig.bin \
firmware-nvidia/gm200/gr/gpccs-bl.bin \
firmware-nvidia/gm200/gr/gpccs-data.bin \
firmware-nvidia/gm200/gr/gpccs-inst.bin \
firmware-nvidia/gm200/gr/gpccs-sig.bin \
firmware-nvidia/gm200/gr/sw-bundle-init.bin \
firmware-nvidia/gm200/gr/sw-ctx.bin \
firmware-nvidia/gm200/gr/sw-method-init.bin \
firmware-nvidia/gm200/gr/sw-nonctx.bin \
firmware-nvidia/gm204/acr/bl.bin \
firmware-nvidia/gm204/acr/ucode-load.bin \
firmware-nvidia/gm204/acr/ucode-unload.bin \
firmware-nvidia/gm204/gr/fecs-bl.bin \
firmware-nvidia/gm204/gr/fecs-data.bin \
firmware-nvidia/gm204/gr/fecs-inst.bin \
firmware-nvidia/gm204/gr/fecs-sig.bin \
firmware-nvidia/gm204/gr/gpccs-bl.bin \
firmware-nvidia/gm204/gr/gpccs-data.bin \
firmware-nvidia/gm204/gr/gpccs-inst.bin \
firmware-nvidia/gm204/gr/gpccs-sig.bin \
firmware-nvidia/gm204/gr/sw-bundle-init.bin \
firmware-nvidia/gm204/gr/sw-ctx.bin \
firmware-nvidia/gm204/gr/sw-method-init.bin \
firmware-nvidia/gm204/gr/sw-nonctx.bin \
firmware-nvidia/gm206/acr/bl.bin \
firmware-nvidia/gm206/acr/ucode-load.bin \
firmware-nvidia/gm206/acr/ucode-unload.bin \
firmware-nvidia/gm206/gr/fecs-bl.bin \
firmware-nvidia/gm206/gr/fecs-data.bin \
firmware-nvidia/gm206/gr/fecs-inst.bin \
firmware-nvidia/gm206/gr/fecs-sig.bin \
firmware-nvidia/gm206/gr/gpccs-bl.bin \
firmware-nvidia/gm206/gr/gpccs-data.bin \
firmware-nvidia/gm206/gr/gpccs-inst.bin \
firmware-nvidia/gm206/gr/gpccs-sig.bin \
firmware-nvidia/gm206/gr/sw-bundle-init.bin \
firmware-nvidia/gm206/gr/sw-ctx.bin \
firmware-nvidia/gm206/gr/sw-method-init.bin \
firmware-nvidia/gm206/gr/sw-nonctx.bin \
firmware-nvidia/gm20b/acr/bl.bin \
firmware-nvidia/gm20b/acr/ucode-load.bin \
firmware-nvidia/gm20b/gr/fecs-bl.bin \
firmware-nvidia/gm20b/gr/fecs-data.bin \
firmware-nvidia/gm20b/gr/fecs-inst.bin \
firmware-nvidia/gm20b/gr/fecs-sig.bin \
firmware-nvidia/gm20b/gr/gpccs-data.bin \
firmware-nvidia/gm20b/gr/gpccs-inst.bin \
firmware-nvidia/gm20b/gr/sw-bundle-init.bin \
firmware-nvidia/gm20b/gr/sw-ctx.bin \
firmware-nvidia/gm20b/gr/sw-method-init.bin \
firmware-nvidia/gm20b/gr/sw-nonctx.bin \
firmware-nvidia/gm20b/pmu/desc.bin \
firmware-nvidia/gm20b/pmu/image.bin \
firmware-nvidia/gm20b/pmu/sig.bin \
firmware-nvidia/gp100/acr/bl.bin \
firmware-nvidia/gp100/acr/ucode-load.bin \
firmware-nvidia/gp100/acr/ucode-unload.bin \
firmware-nvidia/gp100/gr/fecs-bl.bin \
firmware-nvidia/gp100/gr/fecs-data.bin \
firmware-nvidia/gp100/gr/fecs-inst.bin \
firmware-nvidia/gp100/gr/fecs-sig.bin \
firmware-nvidia/gp100/gr/gpccs-bl.bin \
firmware-nvidia/gp100/gr/gpccs-data.bin \
firmware-nvidia/gp100/gr/gpccs-inst.bin \
firmware-nvidia/gp100/gr/gpccs-sig.bin \
firmware-nvidia/gp100/gr/sw-bundle-init.bin \
firmware-nvidia/gp100/gr/sw-ctx.bin \
firmware-nvidia/gp100/gr/sw-method-init.bin \
firmware-nvidia/gp100/gr/sw-nonctx.bin \
firmware-nvidia/gp102/acr/bl.bin \
firmware-nvidia/gp102/acr/ucode-load.bin \
firmware-nvidia/gp102/acr/ucode-unload.bin \
firmware-nvidia/gp102/acr/unload-bl.bin \
firmware-nvidia/gp102/gr/fecs-bl.bin \
firmware-nvidia/gp102/gr/fecs-data.bin \
firmware-nvidia/gp102/gr/fecs-inst.bin \
firmware-nvidia/gp102/gr/fecs-sig.bin \
firmware-nvidia/gp102/gr/gpccs-bl.bin \
firmware-nvidia/gp102/gr/gpccs-data.bin \
firmware-nvidia/gp102/gr/gpccs-inst.bin \
firmware-nvidia/gp102/gr/gpccs-sig.bin \
firmware-nvidia/gp102/gr/sw-bundle-init.bin \
firmware-nvidia/gp102/gr/sw-ctx.bin \
firmware-nvidia/gp102/gr/sw-method-init.bin \
firmware-nvidia/gp102/gr/sw-nonctx.bin \
firmware-nvidia/gp102/nvdec/scrubber.bin \
firmware-nvidia/gp102/sec2/desc-1.bin \
firmware-nvidia/gp102/sec2/desc.bin \
firmware-nvidia/gp102/sec2/image-1.bin \
firmware-nvidia/gp102/sec2/image.bin \
firmware-nvidia/gp102/sec2/sig-1.bin \
firmware-nvidia/gp102/sec2/sig.bin \
firmware-nvidia/gp104/acr/bl.bin \
firmware-nvidia/gp104/acr/ucode-load.bin \
firmware-nvidia/gp104/acr/ucode-unload.bin \
firmware-nvidia/gp104/acr/unload-bl.bin \
firmware-nvidia/gp104/gr/fecs-bl.bin \
firmware-nvidia/gp104/gr/fecs-data.bin \
firmware-nvidia/gp104/gr/fecs-inst.bin \
firmware-nvidia/gp104/gr/fecs-sig.bin \
firmware-nvidia/gp104/gr/gpccs-bl.bin \
firmware-nvidia/gp104/gr/gpccs-data.bin \
firmware-nvidia/gp104/gr/gpccs-inst.bin \
firmware-nvidia/gp104/gr/gpccs-sig.bin \
firmware-nvidia/gp104/gr/sw-bundle-init.bin \
firmware-nvidia/gp104/gr/sw-ctx.bin \
firmware-nvidia/gp104/gr/sw-method-init.bin \
firmware-nvidia/gp104/gr/sw-nonctx.bin \
firmware-nvidia/gp104/nvdec/scrubber.bin \
firmware-nvidia/gp104/sec2/desc-1.bin \
firmware-nvidia/gp104/sec2/desc.bin \
firmware-nvidia/gp104/sec2/image-1.bin \
firmware-nvidia/gp104/sec2/image.bin \
firmware-nvidia/gp104/sec2/sig-1.bin \
firmware-nvidia/gp104/sec2/sig.bin \
firmware-nvidia/gp106/acr/bl.bin \
firmware-nvidia/gp106/acr/ucode-load.bin \
firmware-nvidia/gp106/acr/ucode-unload.bin \
firmware-nvidia/gp106/acr/unload-bl.bin \
firmware-nvidia/gp106/gr/fecs-bl.bin \
firmware-nvidia/gp106/gr/fecs-data.bin \
firmware-nvidia/gp106/gr/fecs-inst.bin \
firmware-nvidia/gp106/gr/fecs-sig.bin \
firmware-nvidia/gp106/gr/gpccs-bl.bin \
firmware-nvidia/gp106/gr/gpccs-data.bin \
firmware-nvidia/gp106/gr/gpccs-inst.bin \
firmware-nvidia/gp106/gr/gpccs-sig.bin \
firmware-nvidia/gp106/gr/sw-bundle-init.bin \
firmware-nvidia/gp106/gr/sw-ctx.bin \
firmware-nvidia/gp106/gr/sw-method-init.bin \
firmware-nvidia/gp106/gr/sw-nonctx.bin \
firmware-nvidia/gp106/nvdec/scrubber.bin \
firmware-nvidia/gp106/sec2/desc-1.bin \
firmware-nvidia/gp106/sec2/desc.bin \
firmware-nvidia/gp106/sec2/image-1.bin \
firmware-nvidia/gp106/sec2/image.bin \
firmware-nvidia/gp106/sec2/sig-1.bin \
firmware-nvidia/gp106/sec2/sig.bin \
firmware-nvidia/gp107/acr/bl.bin \
firmware-nvidia/gp107/acr/ucode-load.bin \
firmware-nvidia/gp107/acr/ucode-unload.bin \
firmware-nvidia/gp107/acr/unload-bl.bin \
firmware-nvidia/gp107/gr/fecs-bl.bin \
firmware-nvidia/gp107/gr/fecs-data.bin \
firmware-nvidia/gp107/gr/fecs-inst.bin \
firmware-nvidia/gp107/gr/fecs-sig.bin \
firmware-nvidia/gp107/gr/gpccs-bl.bin \
firmware-nvidia/gp107/gr/gpccs-data.bin \
firmware-nvidia/gp107/gr/gpccs-inst.bin \
firmware-nvidia/gp107/gr/gpccs-sig.bin \
firmware-nvidia/gp107/gr/sw-bundle-init.bin \
firmware-nvidia/gp107/gr/sw-ctx.bin \
firmware-nvidia/gp107/gr/sw-method-init.bin \
firmware-nvidia/gp107/gr/sw-nonctx.bin \
firmware-nvidia/gp107/nvdec/scrubber.bin \
firmware-nvidia/gp107/sec2/desc-1.bin \
firmware-nvidia/gp107/sec2/desc.bin \
firmware-nvidia/gp107/sec2/image-1.bin \
firmware-nvidia/gp107/sec2/image.bin \
firmware-nvidia/gp107/sec2/sig-1.bin \
firmware-nvidia/gp107/sec2/sig.bin \
firmware-nvidia/gp108/acr/bl.bin \
firmware-nvidia/gp108/acr/ucode-load.bin \
firmware-nvidia/gp108/acr/ucode-unload.bin \
firmware-nvidia/gp108/acr/unload-bl.bin \
firmware-nvidia/gp108/gr/fecs-bl.bin \
firmware-nvidia/gp108/gr/fecs-data.bin \
firmware-nvidia/gp108/gr/fecs-inst.bin \
firmware-nvidia/gp108/gr/fecs-sig.bin \
firmware-nvidia/gp108/gr/gpccs-bl.bin \
firmware-nvidia/gp108/gr/gpccs-data.bin \
firmware-nvidia/gp108/gr/gpccs-inst.bin \
firmware-nvidia/gp108/gr/gpccs-sig.bin \
firmware-nvidia/gp108/gr/sw-bundle-init.bin \
firmware-nvidia/gp108/gr/sw-ctx.bin \
firmware-nvidia/gp108/gr/sw-method-init.bin \
firmware-nvidia/gp108/gr/sw-nonctx.bin \
firmware-nvidia/gp108/nvdec/scrubber.bin \
firmware-nvidia/gp108/sec2/desc.bin \
firmware-nvidia/gp108/sec2/image.bin \
firmware-nvidia/gp108/sec2/sig.bin \
firmware-nvidia/gp10b/acr/bl.bin \
firmware-nvidia/gp10b/acr/ucode-load.bin \
firmware-nvidia/gp10b/gr/fecs-bl.bin \
firmware-nvidia/gp10b/gr/fecs-data.bin \
firmware-nvidia/gp10b/gr/fecs-inst.bin \
firmware-nvidia/gp10b/gr/fecs-sig.bin \
firmware-nvidia/gp10b/gr/gpccs-bl.bin \
firmware-nvidia/gp10b/gr/gpccs-data.bin \
firmware-nvidia/gp10b/gr/gpccs-inst.bin \
firmware-nvidia/gp10b/gr/gpccs-sig.bin \
firmware-nvidia/gp10b/gr/sw-bundle-init.bin \
firmware-nvidia/gp10b/gr/sw-ctx.bin \
firmware-nvidia/gp10b/gr/sw-method-init.bin \
firmware-nvidia/gp10b/gr/sw-nonctx.bin \
firmware-nvidia/gp10b/pmu/desc.bin \
firmware-nvidia/gp10b/pmu/image.bin \
firmware-nvidia/gp10b/pmu/sig.bin \
firmware-nvidia/gv100/acr/bl.bin \
firmware-nvidia/gv100/acr/ucode-load.bin \
firmware-nvidia/gv100/acr/ucode-unload.bin \
firmware-nvidia/gv100/acr/unload-bl.bin \
firmware-nvidia/gv100/gr/fecs-bl.bin \
firmware-nvidia/gv100/gr/fecs-data.bin \
firmware-nvidia/gv100/gr/fecs-inst.bin \
firmware-nvidia/gv100/gr/fecs-sig.bin \
firmware-nvidia/gv100/gr/gpccs-bl.bin \
firmware-nvidia/gv100/gr/gpccs-data.bin \
firmware-nvidia/gv100/gr/gpccs-inst.bin \
firmware-nvidia/gv100/gr/gpccs-sig.bin \
firmware-nvidia/gv100/gr/sw-bundle-init.bin \
firmware-nvidia/gv100/gr/sw-ctx.bin \
firmware-nvidia/gv100/gr/sw-method-init.bin \
firmware-nvidia/gv100/gr/sw-nonctx.bin \
firmware-nvidia/gv100/nvdec/scrubber.bin \
firmware-nvidia/gv100/sec2/desc.bin \
firmware-nvidia/gv100/sec2/image.bin \
firmware-nvidia/gv100/sec2/sig.bin \
firmware-nvidia/tegra124/vic.bin \
firmware-nvidia/tegra124/vic03-ucode.bin \
firmware-nvidia/tegra124/xusb.bin \
firmware-nvidia/tegra186/vic.bin \
firmware-nvidia/tegra186/vic04-ucode.bin \
firmware-nvidia/tegra186/xusb.bin \
firmware-nvidia/tegra194/vic.bin \
firmware-nvidia/tegra194/xusb.bin \
firmware-nvidia/tegra210/vic.bin \
firmware-nvidia/tegra210/vic04-ucode.bin \
firmware-nvidia/tegra210/xusb.bin \
firmware-nvidia/tu102/acr/bl.bin \
firmware-nvidia/tu102/acr/ucode-ahesasc.bin \
firmware-nvidia/tu102/acr/ucode-asb.bin \
firmware-nvidia/tu102/acr/ucode-unload.bin \
firmware-nvidia/tu102/acr/unload-bl.bin \
firmware-nvidia/tu102/gr/fecs-bl.bin \
firmware-nvidia/tu102/gr/fecs-data.bin \
firmware-nvidia/tu102/gr/fecs-inst.bin \
firmware-nvidia/tu102/gr/fecs-sig.bin \
firmware-nvidia/tu102/gr/gpccs-bl.bin \
firmware-nvidia/tu102/gr/gpccs-data.bin \
firmware-nvidia/tu102/gr/gpccs-inst.bin \
firmware-nvidia/tu102/gr/gpccs-sig.bin \
firmware-nvidia/tu102/gr/sw-bundle-init.bin \
firmware-nvidia/tu102/gr/sw-ctx.bin \
firmware-nvidia/tu102/gr/sw-method-init.bin \
firmware-nvidia/tu102/gr/sw-nonctx.bin \
firmware-nvidia/tu102/gr/sw-veid-bundle-init.bin \
firmware-nvidia/tu102/nvdec/scrubber.bin \
firmware-nvidia/tu102/sec2/desc.bin \
firmware-nvidia/tu102/sec2/image.bin \
firmware-nvidia/tu102/sec2/sig.bin \
firmware-nvidia/tu104/acr/bl.bin \
firmware-nvidia/tu104/acr/ucode-ahesasc.bin \
firmware-nvidia/tu104/acr/ucode-asb.bin \
firmware-nvidia/tu104/acr/ucode-unload.bin \
firmware-nvidia/tu104/acr/unload-bl.bin \
firmware-nvidia/tu104/gr/fecs-bl.bin \
firmware-nvidia/tu104/gr/fecs-data.bin \
firmware-nvidia/tu104/gr/fecs-inst.bin \
firmware-nvidia/tu104/gr/fecs-sig.bin \
firmware-nvidia/tu104/gr/gpccs-bl.bin \
firmware-nvidia/tu104/gr/gpccs-data.bin \
firmware-nvidia/tu104/gr/gpccs-inst.bin \
firmware-nvidia/tu104/gr/gpccs-sig.bin \
firmware-nvidia/tu104/gr/sw-bundle-init.bin \
firmware-nvidia/tu104/gr/sw-ctx.bin \
firmware-nvidia/tu104/gr/sw-method-init.bin \
firmware-nvidia/tu104/gr/sw-nonctx.bin \
firmware-nvidia/tu104/gr/sw-veid-bundle-init.bin \
firmware-nvidia/tu104/nvdec/scrubber.bin \
firmware-nvidia/tu104/sec2/desc.bin \
firmware-nvidia/tu104/sec2/image.bin \
firmware-nvidia/tu104/sec2/sig.bin \
firmware-nvidia/tu106/acr/bl.bin \
firmware-nvidia/tu106/acr/ucode-ahesasc.bin \
firmware-nvidia/tu106/acr/ucode-asb.bin \
firmware-nvidia/tu106/acr/ucode-unload.bin \
firmware-nvidia/tu106/acr/unload-bl.bin \
firmware-nvidia/tu106/gr/fecs-bl.bin \
firmware-nvidia/tu106/gr/fecs-data.bin \
firmware-nvidia/tu106/gr/fecs-inst.bin \
firmware-nvidia/tu106/gr/fecs-sig.bin \
firmware-nvidia/tu106/gr/gpccs-bl.bin \
firmware-nvidia/tu106/gr/gpccs-data.bin \
firmware-nvidia/tu106/gr/gpccs-inst.bin \
firmware-nvidia/tu106/gr/gpccs-sig.bin \
firmware-nvidia/tu106/gr/sw-bundle-init.bin \
firmware-nvidia/tu106/gr/sw-ctx.bin \
firmware-nvidia/tu106/gr/sw-method-init.bin \
firmware-nvidia/tu106/gr/sw-nonctx.bin \
firmware-nvidia/tu106/gr/sw-veid-bundle-init.bin \
firmware-nvidia/tu106/nvdec/scrubber.bin \
firmware-nvidia/tu106/sec2/desc.bin \
firmware-nvidia/tu106/sec2/image.bin \
firmware-nvidia/tu106/sec2/sig.bin \
firmware-nvidia/tu10x/typec/ccg-boot.cyacd \
firmware-nvidia/tu10x/typec/ccg-primary.cyacd \
firmware-nvidia/tu10x/typec/ccg-secondary.cyacd \
firmware-nvidia/tu116/acr/bl.bin \
firmware-nvidia/tu116/acr/ucode-ahesasc.bin \
firmware-nvidia/tu116/acr/ucode-asb.bin \
firmware-nvidia/tu116/acr/ucode-unload.bin \
firmware-nvidia/tu116/acr/unload-bl.bin \
firmware-nvidia/tu116/gr/fecs-bl.bin \
firmware-nvidia/tu116/gr/fecs-data.bin \
firmware-nvidia/tu116/gr/fecs-inst.bin \
firmware-nvidia/tu116/gr/fecs-sig.bin \
firmware-nvidia/tu116/gr/gpccs-bl.bin \
firmware-nvidia/tu116/gr/gpccs-data.bin \
firmware-nvidia/tu116/gr/gpccs-inst.bin \
firmware-nvidia/tu116/gr/gpccs-sig.bin \
firmware-nvidia/tu116/gr/sw-bundle-init.bin \
firmware-nvidia/tu116/gr/sw-ctx.bin \
firmware-nvidia/tu116/gr/sw-method-init.bin \
firmware-nvidia/tu116/gr/sw-nonctx.bin \
firmware-nvidia/tu116/gr/sw-veid-bundle-init.bin \
firmware-nvidia/tu116/nvdec/scrubber.bin \
firmware-nvidia/tu116/sec2/desc.bin \
firmware-nvidia/tu116/sec2/image.bin \
firmware-nvidia/tu116/sec2/sig.bin \
firmware-nvidia/tu117/acr/bl.bin \
firmware-nvidia/tu117/acr/ucode-ahesasc.bin \
firmware-nvidia/tu117/acr/ucode-asb.bin \
firmware-nvidia/tu117/acr/ucode-unload.bin \
firmware-nvidia/tu117/acr/unload-bl.bin \
firmware-nvidia/tu117/gr/fecs-bl.bin \
firmware-nvidia/tu117/gr/fecs-data.bin \
firmware-nvidia/tu117/gr/fecs-inst.bin \
firmware-nvidia/tu117/gr/fecs-sig.bin \
firmware-nvidia/tu117/gr/gpccs-bl.bin \
firmware-nvidia/tu117/gr/gpccs-data.bin \
firmware-nvidia/tu117/gr/gpccs-inst.bin \
firmware-nvidia/tu117/gr/gpccs-sig.bin \
firmware-nvidia/tu117/gr/sw-bundle-init.bin \
firmware-nvidia/tu117/gr/sw-ctx.bin \
firmware-nvidia/tu117/gr/sw-method-init.bin \
firmware-nvidia/tu117/gr/sw-nonctx.bin \
firmware-nvidia/tu117/gr/sw-veid-bundle-init.bin \
firmware-nvidia/tu117/nvdec/scrubber.bin \
firmware-nvidia/tu117/sec2/desc.bin \
firmware-nvidia/tu117/sec2/image.bin \
firmware-nvidia/tu117/sec2/sig.bin \
kernel-firmware-nvidia"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
