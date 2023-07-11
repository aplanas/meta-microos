SUMMARY = "The Standard Kernel - base modules"
DESCRIPTION = "The standard kernel for both uniprocessor and multiprocessor systems. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable \
This package contains only the base modules, required in all installs. \
 \
This is a subpackage of kernel-default. Development files are in \
kernel-default-devel, sources in kernel-source, and \
debug information in kernel-default-debuginfo."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-default-base-6.3.9-1.1.28.1.aarch64.rpm"
RPM_HASH = "66c74bb394870bd6817cd8b2fefa8ea3d759fc5171a68f805a7ecb66997ef78946b0fbb7ab16ee0472f85ec1530cb048436117a2472090221e162031eef07d19"

RPROVIDES:${PN} += "kernel \
kernel-base \
kernel-default \
kernel-default-6.3.9-1 \
kernel-default-aarch64 \
kernel-default-base \
kernel-default-base-srchash-0df701dd2c208f4843cf219b4b26b533ada9bd34 \
kernel-preempt \
kernel-preempt-aarch64 \
kernel-srchash-0df701dd2c208f4843cf219b4b26b533ada9bd34 \
kernel-uname-r \
kmod-8139cp.ko \
kmod-8139too.ko \
kmod-8250-base.ko \
kmod-8250-bcm2835aux.ko \
kmod-8250-bcm7271.ko \
kmod-8250-dw.ko \
kmod-8250-exar.ko \
kmod-8250-mtk.ko \
kmod-8250-of.ko \
kmod-8250-pci.ko \
kmod-8250-pci1xxxx.ko \
kmod-8250-pericom.ko \
kmod-8250-tegra.ko \
kmod-8250.ko \
kmod-8390.ko \
kmod-BusLogic.ko \
kmod-acpi-mdio.ko \
kmod-adiantum.ko \
kmod-aead.ko \
kmod-aegis128.ko \
kmod-aes-arm64.ko \
kmod-aes-ce-blk.ko \
kmod-aes-ce-ccm.ko \
kmod-aes-ce-cipher.ko \
kmod-aes-generic.ko \
kmod-aes-neon-blk.ko \
kmod-aes-neon-bs.ko \
kmod-aes-ti.ko \
kmod-af-alg.ko \
kmod-af-packet-diag.ko \
kmod-af-packet.ko \
kmod-ahci.ko \
kmod-akcipher.ko \
kmod-algif-aead.ko \
kmod-algif-hash.ko \
kmod-algif-rng.ko \
kmod-algif-skcipher.ko \
kmod-altera-edac.ko \
kmod-altera-sysmgr.ko \
kmod-am53c974.ko \
kmod-amba-pl010.ko \
kmod-amba-pl011.ko \
kmod-ansi-cprng.ko \
kmod-apple-m1-cpu-pmu.ko \
kmod-apple-pmgr-pwrstate.ko \
kmod-aria-generic.ko \
kmod-arm-cci.ko \
kmod-arm-ccn.ko \
kmod-arm-smmu-v3.ko \
kmod-arm-smmu.ko \
kmod-arp-tables.ko \
kmod-arpt-mangle.ko \
kmod-arptable-filter.ko \
kmod-asn1-decoder.ko \
kmod-asymmetric-keys.ko \
kmod-async-memcpy.ko \
kmod-async-pq.ko \
kmod-async-raid6-recov.ko \
kmod-async-tx.ko \
kmod-async-xor.ko \
kmod-ata-piix.ko \
kmod-atkbd.ko \
kmod-auth-rpcgss.ko \
kmod-authenc.ko \
kmod-authencesn.ko \
kmod-autofs4.ko \
kmod-axg-aoclk.ko \
kmod-axg.ko \
kmod-backlight.ko \
kmod-bcm2835-mailbox.ko \
kmod-bcm2835-pm.ko \
kmod-bcm2835-power.ko \
kmod-bcm84881.ko \
kmod-bfq.ko \
kmod-binfmt-elf.ko \
kmod-binfmt-misc.ko \
kmod-binfmt-script.ko \
kmod-blake2b-generic.ko \
kmod-blowfish-common.ko \
kmod-blowfish-generic.ko \
kmod-bluetooth.ko \
kmod-bpfilter.ko \
kmod-br-netfilter.ko \
kmod-brcmstb-dpfe.ko \
kmod-brcmstb-gisb.ko \
kmod-brd.ko \
kmod-bridge.ko \
kmod-bsg.ko \
kmod-btree.ko \
kmod-btrfs.ko \
kmod-button.ko \
kmod-camellia-generic.ko \
kmod-cast-common.ko \
kmod-cast5-generic.ko \
kmod-cast6-generic.ko \
kmod-cbc.ko \
kmod-ccm.ko \
kmod-cdrom.ko \
kmod-ceph.ko \
kmod-cfb.ko \
kmod-cfbcopyarea.ko \
kmod-cfbfillrect.ko \
kmod-cfbimgblt.ko \
kmod-chacha-generic.ko \
kmod-chacha-neon.ko \
kmod-chacha20poly1305.ko \
kmod-cifs-arc4.ko \
kmod-cifs-md4.ko \
kmod-cifs.ko \
kmod-clk-apmixed.ko \
kmod-clk-bm1880.ko \
kmod-clk-cpu-dyndiv.ko \
kmod-clk-cpumux.ko \
kmod-clk-dualdiv.ko \
kmod-clk-gate.ko \
kmod-clk-imx-lpcg-scu.ko \
kmod-clk-imx-scu.ko \
kmod-clk-imx8mm.ko \
kmod-clk-imx8mn.ko \
kmod-clk-imx8mp.ko \
kmod-clk-imx8mq.ko \
kmod-clk-mpll.ko \
kmod-clk-mt6779-aud.ko \
kmod-clk-mt6779-cam.ko \
kmod-clk-mt6779-img.ko \
kmod-clk-mt6779-ipe.ko \
kmod-clk-mt6779-mfg.ko \
kmod-clk-mt6779-mm.ko \
kmod-clk-mt6779-vdec.ko \
kmod-clk-mt6779-venc.ko \
kmod-clk-mt6779.ko \
kmod-clk-mt6795-apmixedsys.ko \
kmod-clk-mt6795-infracfg.ko \
kmod-clk-mt6795-pericfg.ko \
kmod-clk-mt6795-topckgen.ko \
kmod-clk-mt8173-apmixedsys.ko \
kmod-clk-mt8173-infracfg.ko \
kmod-clk-mt8173-mm.ko \
kmod-clk-mt8173-pericfg.ko \
kmod-clk-mt8173-topckgen.ko \
kmod-clk-mtk.ko \
kmod-clk-mux.ko \
kmod-clk-pll.ko \
kmod-clk-regmap.ko \
kmod-clk-vexpress-osc.ko \
kmod-cls-bpf.ko \
kmod-cmac.ko \
kmod-cmd-db.ko \
kmod-cn.ko \
kmod-compat-binfmt-elf.ko \
kmod-configfs.ko \
kmod-configs.ko \
kmod-cpufreq-ondemand.ko \
kmod-cpufreq-performance.ko \
kmod-crc-ccitt.ko \
kmod-crc-t10dif.ko \
kmod-crc16.ko \
kmod-crc32-generic.ko \
kmod-crc32.ko \
kmod-crc32c-generic.ko \
kmod-crc64-rocksoft-generic.ko \
kmod-crc64-rocksoft.ko \
kmod-crc64.ko \
kmod-crc8.ko \
kmod-crct10dif-ce.ko \
kmod-crct10dif-common.ko \
kmod-crct10dif-generic.ko \
kmod-cryptd.ko \
kmod-crypto-acompress.ko \
kmod-crypto-algapi.ko \
kmod-crypto-engine.ko \
kmod-crypto-hash.ko \
kmod-crypto-null.ko \
kmod-crypto-user.ko \
kmod-crypto.ko \
kmod-cryptomgr.ko \
kmod-ctr.ko \
kmod-cts.ko \
kmod-curve25519-generic.ko \
kmod-dax.ko \
kmod-deflate.ko \
kmod-des-generic.ko \
kmod-dh-generic.ko \
kmod-digsig.ko \
kmod-dm-mod.ko \
kmod-dns-resolver.ko \
kmod-drbg.ko \
kmod-drm-kms-helper.ko \
kmod-drm-mipi-dsi.ko \
kmod-drm-panel-orientation-quirks.ko \
kmod-drm-shmem-helper.ko \
kmod-drm.ko \
kmod-drop-monitor.ko \
kmod-e100.ko \
kmod-e1000.ko \
kmod-e1000e.ko \
kmod-ebt-802-3.ko \
kmod-ebt-among.ko \
kmod-ebt-arp.ko \
kmod-ebt-arpreply.ko \
kmod-ebt-dnat.ko \
kmod-ebt-ip.ko \
kmod-ebt-ip6.ko \
kmod-ebt-limit.ko \
kmod-ebt-log.ko \
kmod-ebt-mark-m.ko \
kmod-ebt-mark.ko \
kmod-ebt-nflog.ko \
kmod-ebt-pkttype.ko \
kmod-ebt-redirect.ko \
kmod-ebt-snat.ko \
kmod-ebt-stp.ko \
kmod-ebt-vlan.ko \
kmod-ebtable-broute.ko \
kmod-ebtable-filter.ko \
kmod-ebtable-nat.ko \
kmod-ebtables.ko \
kmod-ecb.ko \
kmod-ecc.ko \
kmod-ecdh-generic.ko \
kmod-ecdsa-generic.ko \
kmod-echainiv.ko \
kmod-ecrdsa-generic.ko \
kmod-edac-core.ko \
kmod-efivarfs.ko \
kmod-ehci-hcd.ko \
kmod-ehci-pci.ko \
kmod-encrypted-keys.ko \
kmod-esp-scsi.ko \
kmod-essiv.ko \
kmod-evdev.ko \
kmod-exfat.ko \
kmod-exportfs.ko \
kmod-ext4.ko \
kmod-extcon-core.ko \
kmod-exynos-bus.ko \
kmod-exynos-chipid.ko \
kmod-exynos-nocp.ko \
kmod-exynos-ppmu.ko \
kmod-failover.ko \
kmod-fan.ko \
kmod-fat.ko \
kmod-fb-sys-fops.ko \
kmod-fb.ko \
kmod-fcrypt.ko \
kmod-firmware-class.ko \
kmod-fixed-phy.ko \
kmod-font.ko \
kmod-freq-table.ko \
kmod-fscache.ko \
kmod-fsl-ifc.ko \
kmod-fsl-linflexuart.ko \
kmod-fsl-lpuart.ko \
kmod-fuse.ko \
kmod-fwnode-mdio.ko \
kmod-g12a-aoclk.ko \
kmod-g12a.ko \
kmod-gcm.ko \
kmod-geneve.ko \
kmod-geniv.ko \
kmod-gf128mul.ko \
kmod-ghash-ce.ko \
kmod-ghash-generic.ko \
kmod-ghes-edac.ko \
kmod-glob.ko \
kmod-governor-passive.ko \
kmod-governor-simpleondemand.ko \
kmod-gpio-generic.ko \
kmod-gpio-imx-scu.ko \
kmod-gpio-mxc.ko \
kmod-gpio-pca953x.ko \
kmod-gpio-pl061.ko \
kmod-gpio-poweroff.ko \
kmod-gpio-restart.ko \
kmod-gpio-tegra.ko \
kmod-grace.ko \
kmod-gre.ko \
kmod-gxbb-aoclk.ko \
kmod-gxbb.ko \
kmod-hctr2.ko \
kmod-hed.ko \
kmod-hid-generic.ko \
kmod-hid-hyperv.ko \
kmod-hid.ko \
kmod-hisi-uncore-cpa-pmu.ko \
kmod-hisi-uncore-ddrc-pmu.ko \
kmod-hisi-uncore-hha-pmu.ko \
kmod-hisi-uncore-l3c-pmu.ko \
kmod-hisi-uncore-pa-pmu.ko \
kmod-hisi-uncore-pmu.ko \
kmod-hisi-uncore-sllc-pmu.ko \
kmod-hmac.ko \
kmod-hv-balloon.ko \
kmod-hv-netvsc.ko \
kmod-hv-sock.ko \
kmod-hv-storvsc.ko \
kmod-hv-utils.ko \
kmod-hv-vmbus.ko \
kmod-hwmon.ko \
kmod-hwspinlock-core.ko \
kmod-hyperv-keyboard.ko \
kmod-i2c-core.ko \
kmod-i2c-designware-core.ko \
kmod-i2c-designware-platform.ko \
kmod-i2c-sprd.ko \
kmod-i6300esb.ko \
kmod-icc-core.ko \
kmod-imx-earlycon.ko \
kmod-imx-scu.ko \
kmod-imx-weim.ko \
kmod-imx.ko \
kmod-imx93-blk-ctrl.ko \
kmod-inet-diag.ko \
kmod-input-core.ko \
kmod-input-leds.ko \
kmod-interconnect-qcom.ko \
kmod-ioasid.ko \
kmod-iova.ko \
kmod-ip-gre.ko \
kmod-ip-set-bitmap-ip.ko \
kmod-ip-set-bitmap-ipmac.ko \
kmod-ip-set-bitmap-port.ko \
kmod-ip-set-hash-ip.ko \
kmod-ip-set-hash-ipmac.ko \
kmod-ip-set-hash-ipmark.ko \
kmod-ip-set-hash-ipport.ko \
kmod-ip-set-hash-ipportip.ko \
kmod-ip-set-hash-ipportnet.ko \
kmod-ip-set-hash-mac.ko \
kmod-ip-set-hash-net.ko \
kmod-ip-set-hash-netiface.ko \
kmod-ip-set-hash-netnet.ko \
kmod-ip-set-hash-netport.ko \
kmod-ip-set-hash-netportnet.ko \
kmod-ip-set-list-set.ko \
kmod-ip-set.ko \
kmod-ip-tables.ko \
kmod-ip-tunnel.ko \
kmod-ip-vs-dh.ko \
kmod-ip-vs-fo.ko \
kmod-ip-vs-ftp.ko \
kmod-ip-vs-lblc.ko \
kmod-ip-vs-lblcr.ko \
kmod-ip-vs-lc.ko \
kmod-ip-vs-mh.ko \
kmod-ip-vs-nq.ko \
kmod-ip-vs-ovf.ko \
kmod-ip-vs-pe-sip.ko \
kmod-ip-vs-rr.ko \
kmod-ip-vs-sed.ko \
kmod-ip-vs-sh.ko \
kmod-ip-vs-twos.ko \
kmod-ip-vs-wlc.ko \
kmod-ip-vs-wrr.ko \
kmod-ip-vs.ko \
kmod-ip-vti.ko \
kmod-ip6-tables.ko \
kmod-ip6-udp-tunnel.ko \
kmod-ip6t-NPT.ko \
kmod-ip6t-REJECT.ko \
kmod-ip6t-SYNPROXY.ko \
kmod-ip6t-ah.ko \
kmod-ip6t-eui64.ko \
kmod-ip6t-frag.ko \
kmod-ip6t-hbh.ko \
kmod-ip6t-ipv6header.ko \
kmod-ip6t-mh.ko \
kmod-ip6t-rpfilter.ko \
kmod-ip6t-rt.ko \
kmod-ip6t-srh.ko \
kmod-ip6table-filter.ko \
kmod-ip6table-mangle.ko \
kmod-ip6table-nat.ko \
kmod-ip6table-raw.ko \
kmod-ip6table-security.ko \
kmod-ipt-ECN.ko \
kmod-ipt-REJECT.ko \
kmod-ipt-SYNPROXY.ko \
kmod-ipt-ah.ko \
kmod-ipt-rpfilter.ko \
kmod-iptable-filter.ko \
kmod-iptable-mangle.ko \
kmod-iptable-nat.ko \
kmod-iptable-raw.ko \
kmod-iptable-security.ko \
kmod-ipu-idmac.ko \
kmod-ipv6.ko \
kmod-irq-al-fic.ko \
kmod-irq-bcm7038-l1.ko \
kmod-irq-brcmstb-l2.ko \
kmod-irq-ls-scfg-msi.ko \
kmod-irq-mbigen.ko \
kmod-irq-meson-gpio.ko \
kmod-irq-mvebu-pic.ko \
kmod-irq-renesas-irqc.ko \
kmod-irq-renesas-rzg2l.ko \
kmod-irqbypass.ko \
kmod-iscsi-boot-sysfs.ko \
kmod-iscsi-ibft.ko \
kmod-isofs.ko \
kmod-jbd2.ko \
kmod-jitterentropy-rng.ko \
kmod-kdf-sp800108.ko \
kmod-keywrap.ko \
kmod-kgdboc.ko \
kmod-kpp.ko \
kmod-kvm.ko \
kmod-kyber-iosched.ko \
kmod-led-class.ko \
kmod-ledtrig-default-on.ko \
kmod-libaes.ko \
kmod-libahci.ko \
kmod-libata.ko \
kmod-libblake2s.ko \
kmod-libceph.ko \
kmod-libchacha.ko \
kmod-libchacha20poly1305.ko \
kmod-libcrc32c.ko \
kmod-libcryptoutils.ko \
kmod-libcurve25519-generic.ko \
kmod-libdes.ko \
kmod-libnvdimm.ko \
kmod-libphy.ko \
kmod-libpoly1305.ko \
kmod-libps2.ko \
kmod-libsha1.ko \
kmod-libsha256.ko \
kmod-linear-ranges.ko \
kmod-llc.ko \
kmod-lockd.ko \
kmod-loop.ko \
kmod-lrw.ko \
kmod-ltc2952-poweroff.ko \
kmod-lz4-compress.ko \
kmod-lz4-decompress.ko \
kmod-lz4.ko \
kmod-lz4hc-compress.ko \
kmod-lz4hc.ko \
kmod-lzo-compress.ko \
kmod-lzo-decompress.ko \
kmod-lzo-rle.ko \
kmod-lzo.ko \
kmod-mbcache.ko \
kmod-mctp.ko \
kmod-md4.ko \
kmod-md5.ko \
kmod-mdio-devres.ko \
kmod-mdio-xgene.ko \
kmod-meson-aoclk.ko \
kmod-meson-clk-measure.ko \
kmod-meson-ee-pwrc.ko \
kmod-meson-eeclk.ko \
kmod-meson-gx-pwrc-vpu.ko \
kmod-meson-secure-pwrc.ko \
kmod-meson-sm.ko \
kmod-meson-uart.ko \
kmod-mfd-core.ko \
kmod-michael-mic.ko \
kmod-mii.ko \
kmod-mousedev.ko \
kmod-mpi.ko \
kmod-mptbase.ko \
kmod-mptsas.ko \
kmod-mptscsih.ko \
kmod-mptspi.ko \
kmod-mq-deadline.ko \
kmod-msm-serial.ko \
kmod-mtk-eint.ko \
kmod-mtk-iommu.ko \
kmod-mtk-mmsys.ko \
kmod-mtk-mutex.ko \
kmod-mtk-regulator-coupler.ko \
kmod-mtk-smi.ko \
kmod-mv-xor-v2.ko \
kmod-mx3fb.ko \
kmod-mxc-clk.ko \
kmod-n-null.ko \
kmod-nd-virtio.ko \
kmod-ne2k-pci.ko \
kmod-net-failover.ko \
kmod-netfs.ko \
kmod-netlink-diag.ko \
kmod-nf-conncount.ko \
kmod-nf-conntrack-amanda.ko \
kmod-nf-conntrack-bridge.ko \
kmod-nf-conntrack-broadcast.ko \
kmod-nf-conntrack-ftp.ko \
kmod-nf-conntrack-h323.ko \
kmod-nf-conntrack-irc.ko \
kmod-nf-conntrack-netbios-ns.ko \
kmod-nf-conntrack-netlink.ko \
kmod-nf-conntrack-pptp.ko \
kmod-nf-conntrack-sane.ko \
kmod-nf-conntrack-sip.ko \
kmod-nf-conntrack-snmp.ko \
kmod-nf-conntrack-tftp.ko \
kmod-nf-conntrack.ko \
kmod-nf-defrag-ipv4.ko \
kmod-nf-defrag-ipv6.ko \
kmod-nf-dup-ipv4.ko \
kmod-nf-dup-ipv6.ko \
kmod-nf-dup-netdev.ko \
kmod-nf-flow-table-inet.ko \
kmod-nf-flow-table.ko \
kmod-nf-log-syslog.ko \
kmod-nf-nat-amanda.ko \
kmod-nf-nat-ftp.ko \
kmod-nf-nat-h323.ko \
kmod-nf-nat-irc.ko \
kmod-nf-nat-pptp.ko \
kmod-nf-nat-sip.ko \
kmod-nf-nat-snmp-basic.ko \
kmod-nf-nat-tftp.ko \
kmod-nf-nat.ko \
kmod-nf-reject-ipv4.ko \
kmod-nf-reject-ipv6.ko \
kmod-nf-socket-ipv4.ko \
kmod-nf-socket-ipv6.ko \
kmod-nf-synproxy-core.ko \
kmod-nf-tables.ko \
kmod-nf-tproxy-ipv4.ko \
kmod-nf-tproxy-ipv6.ko \
kmod-nfnetlink-acct.ko \
kmod-nfnetlink-cthelper.ko \
kmod-nfnetlink-cttimeout.ko \
kmod-nfnetlink-hook.ko \
kmod-nfnetlink-log.ko \
kmod-nfnetlink-osf.ko \
kmod-nfnetlink-queue.ko \
kmod-nfnetlink.ko \
kmod-nfs-acl.ko \
kmod-nfs-layout-flexfiles.ko \
kmod-nfs-layout-nfsv41-files.ko \
kmod-nfs-ssc.ko \
kmod-nfs.ko \
kmod-nfsd.ko \
kmod-nfsv2.ko \
kmod-nfsv3.ko \
kmod-nfsv4.ko \
kmod-nft-chain-nat.ko \
kmod-nft-compat.ko \
kmod-nft-connlimit.ko \
kmod-nft-ct.ko \
kmod-nft-dup-ipv4.ko \
kmod-nft-dup-ipv6.ko \
kmod-nft-dup-netdev.ko \
kmod-nft-fib-inet.ko \
kmod-nft-fib-ipv4.ko \
kmod-nft-fib-ipv6.ko \
kmod-nft-fib-netdev.ko \
kmod-nft-fib.ko \
kmod-nft-flow-offload.ko \
kmod-nft-fwd-netdev.ko \
kmod-nft-hash.ko \
kmod-nft-limit.ko \
kmod-nft-log.ko \
kmod-nft-masq.ko \
kmod-nft-meta-bridge.ko \
kmod-nft-nat.ko \
kmod-nft-numgen.ko \
kmod-nft-osf.ko \
kmod-nft-queue.ko \
kmod-nft-quota.ko \
kmod-nft-redir.ko \
kmod-nft-reject-bridge.ko \
kmod-nft-reject-inet.ko \
kmod-nft-reject-ipv4.ko \
kmod-nft-reject-ipv6.ko \
kmod-nft-reject-netdev.ko \
kmod-nft-reject.ko \
kmod-nft-socket.ko \
kmod-nft-synproxy.ko \
kmod-nft-tproxy.ko \
kmod-nft-tunnel.ko \
kmod-nft-xfrm.ko \
kmod-nhpoly1305-neon.ko \
kmod-nhpoly1305.ko \
kmod-nls-base.ko \
kmod-nls-cp437.ko \
kmod-nls-iso8859-1.ko \
kmod-nls-utf8.ko \
kmod-nsh.ko \
kmod-ntb.ko \
kmod-nvmem-core.ko \
kmod-nvmem-zynqmp-nvmem.ko \
kmod-odroid-go-ultra-poweroff.ko \
kmod-of-mdio.ko \
kmod-ofb.ko \
kmod-ohci-hcd.ko \
kmod-ohci-pci.ko \
kmod-oid-registry.ko \
kmod-openvswitch.ko \
kmod-overlay.ko \
kmod-owl-uart.ko \
kmod-packing.ko \
kmod-pcbc.ko \
kmod-pci-aardvark.ko \
kmod-pci-host-common.ko \
kmod-pci-host-generic.ko \
kmod-pci-meson.ko \
kmod-pci-stub.ko \
kmod-pcie-altera-msi.ko \
kmod-pcie-altera.ko \
kmod-pcie-kirin.ko \
kmod-pcie-mediatek.ko \
kmod-pcrypt.ko \
kmod-pinctrl-amd.ko \
kmod-pinctrl-bcm2835.ko \
kmod-pinctrl-imx.ko \
kmod-pinctrl-imx8dxl.ko \
kmod-pinctrl-imx8mm.ko \
kmod-pinctrl-imx8mn.ko \
kmod-pinctrl-imx8mp.ko \
kmod-pinctrl-imx8mq.ko \
kmod-pinctrl-imx8qm.ko \
kmod-pinctrl-imx8qxp.ko \
kmod-pinctrl-imx8ulp.ko \
kmod-pinctrl-meson-a1.ko \
kmod-pinctrl-meson-axg-pmx.ko \
kmod-pinctrl-meson-axg.ko \
kmod-pinctrl-meson-g12a.ko \
kmod-pinctrl-meson-gxbb.ko \
kmod-pinctrl-meson-gxl.ko \
kmod-pinctrl-meson-s4.ko \
kmod-pinctrl-meson.ko \
kmod-pinctrl-meson8-pmx.ko \
kmod-pinctrl-msm.ko \
kmod-pinctrl-mt6765.ko \
kmod-pinctrl-mt6779.ko \
kmod-pinctrl-mt8188.ko \
kmod-pinctrl-mt8192.ko \
kmod-pinctrl-mt8365.ko \
kmod-pinctrl-mtk-common-v2.ko \
kmod-pinctrl-paris.ko \
kmod-pinctrl-rockchip.ko \
kmod-pinctrl-rzg2l.ko \
kmod-pinctrl-rzv2m.ko \
kmod-pinctrl-s700.ko \
kmod-pinctrl-s900.ko \
kmod-pinctrl-scu.ko \
kmod-pinctrl-single.ko \
kmod-pinctrl-sprd-sc9860.ko \
kmod-pinctrl-sprd.ko \
kmod-pinctrl-zynqmp.ko \
kmod-pkcs7-message.ko \
kmod-pkcs8-key-parser.ko \
kmod-pldmfw.ko \
kmod-poly1305-generic.ko \
kmod-poly1305-neon.ko \
kmod-polyval-ce.ko \
kmod-polyval-generic.ko \
kmod-power-supply.ko \
kmod-pps-core.ko \
kmod-pretimeout-noop.ko \
kmod-processor.ko \
kmod-psmouse.ko \
kmod-pstore.ko \
kmod-ptp-kvm.ko \
kmod-ptp.ko \
kmod-public-key.ko \
kmod-pwc-rzv2m.ko \
kmod-qcom-ebi2.ko \
kmod-qcom-geni-se.ko \
kmod-qcom-geni-serial.ko \
kmod-qcom-ipcc.ko \
kmod-qcom-pdc.ko \
kmod-qcom-rpmh.ko \
kmod-qcom-scm.ko \
kmod-qcom-ssc-block-bus.ko \
kmod-qemu-fw-cfg.ko \
kmod-quota-tree.ko \
kmod-quota-v1.ko \
kmod-quota-v2.ko \
kmod-raid6-pq.ko \
kmod-raid6test.ko \
kmod-raspberrypi-power.ko \
kmod-raspberrypi.ko \
kmod-rational.ko \
kmod-raw-diag.ko \
kmod-rbd.ko \
kmod-regmap-i2c.ko \
kmod-regmap-mmio.ko \
kmod-regmap-spi.ko \
kmod-regulator-poweroff.ko \
kmod-remoteproc.ko \
kmod-renesas-cpg-mssr.ko \
kmod-reset-berlin.ko \
kmod-reset-brcmstb-rescal.ko \
kmod-reset-imx7.ko \
kmod-reset-meson.ko \
kmod-reset-microchip-sparx5.ko \
kmod-reset-qcom-aoss.ko \
kmod-reset-raspberrypi.ko \
kmod-reset.ko \
kmod-restart-poweroff.ko \
kmod-rfkill.ko \
kmod-rmd160.ko \
kmod-rng-core.ko \
kmod-rng.ko \
kmod-rockchip-mailbox.ko \
kmod-roles.ko \
kmod-rpmhpd.ko \
kmod-rpmsg-core.ko \
kmod-rpmsg-ns.ko \
kmod-rsa-generic.ko \
kmod-rtc-efi.ko \
kmod-rtc-imx-sc.ko \
kmod-rtc-mt2712.ko \
kmod-rtc-mv.ko \
kmod-rtc-pl030.ko \
kmod-rtc-pl031.ko \
kmod-rtc-rv8803.ko \
kmod-rtc-xgene.ko \
kmod-rtc-zynqmp.ko \
kmod-rzg2l-cpg.ko \
kmod-samsung-tty.ko \
kmod-sch-ingress.ko \
kmod-scmi-core.ko \
kmod-scmi-module.ko \
kmod-scsi-common.ko \
kmod-scsi-mod.ko \
kmod-scsi-transport-fc.ko \
kmod-scsi-transport-iscsi.ko \
kmod-scsi-transport-sas.ko \
kmod-scsi-transport-spi.ko \
kmod-scu-pd.ko \
kmod-sd-mod.ko \
kmod-selftests.ko \
kmod-seqiv.ko \
kmod-serdev.ko \
kmod-serial-core.ko \
kmod-serial-mctrl-gpio.ko \
kmod-serio.ko \
kmod-serpent-generic.ko \
kmod-sg.ko \
kmod-sh-cmt.ko \
kmod-sh-sci.ko \
kmod-sh-tmu.ko \
kmod-sha1-ce.ko \
kmod-sha1-generic.ko \
kmod-sha2-ce.ko \
kmod-sha256-arm64.ko \
kmod-sha256-generic.ko \
kmod-sha3-ce.ko \
kmod-sha3-generic.ko \
kmod-sha512-arm64.ko \
kmod-sha512-ce.ko \
kmod-sha512-generic.ko \
kmod-simple-pm-bus.ko \
kmod-simpledrm.ko \
kmod-skcipher.ko \
kmod-sm2-generic.ko \
kmod-sm3-ce.ko \
kmod-sm3-generic.ko \
kmod-sm3-neon.ko \
kmod-sm3.ko \
kmod-sm4-ce-ccm.ko \
kmod-sm4-ce-cipher.ko \
kmod-sm4-ce-gcm.ko \
kmod-sm4-ce.ko \
kmod-sm4-generic.ko \
kmod-sm4-neon.ko \
kmod-sm4.ko \
kmod-snd-pcm.ko \
kmod-snd-timer.ko \
kmod-snd.ko \
kmod-soundcore.ko \
kmod-spi-fsl-lib.ko \
kmod-spi-fsl-spi.ko \
kmod-sprd-serial.ko \
kmod-squashfs.ko \
kmod-sr-mod.ko \
kmod-st.ko \
kmod-stm-console.ko \
kmod-stm-core.ko \
kmod-stp.ko \
kmod-streebog-generic.ko \
kmod-sun50i-a100-ccu.ko \
kmod-sun50i-a100-r-ccu.ko \
kmod-sun50i-a64-ccu.ko \
kmod-sun50i-h6-ccu.ko \
kmod-sun50i-h6-r-ccu.ko \
kmod-sun50i-h616-ccu.ko \
kmod-sun50i-iommu.ko \
kmod-sun8i-de2-ccu.ko \
kmod-sun8i-h3-ccu.ko \
kmod-sun8i-r-ccu.ko \
kmod-sunrpc.ko \
kmod-sunxi-ccu.ko \
kmod-sunxi-sram.ko \
kmod-sym53c8xx.ko \
kmod-syscopyarea.ko \
kmod-sysfillrect.ko \
kmod-sysimgblt.ko \
kmod-t10-pi.ko \
kmod-tcp-cubic.ko \
kmod-tcp-diag.ko \
kmod-tcrypt.ko \
kmod-tegra-aconnect.ko \
kmod-tegra-ahb.ko \
kmod-tegra-mc.ko \
kmod-tegra-tcu.ko \
kmod-tegra124-cpufreq.ko \
kmod-tegra186-emc.ko \
kmod-tegra194-cbb.ko \
kmod-tegra20-apb-dma.ko \
kmod-tegra234-cbb.ko \
kmod-thermal.ko \
kmod-timer-tegra186.ko \
kmod-tpm-crb.ko \
kmod-tpm-tis-core.ko \
kmod-tpm-tis.ko \
kmod-tpm.ko \
kmod-tulip.ko \
kmod-tun.ko \
kmod-tunnel4.ko \
kmod-tunnel6.ko \
kmod-twofish-common.ko \
kmod-twofish-generic.ko \
kmod-typec-ucsi.ko \
kmod-typec.ko \
kmod-ucs2-string.ko \
kmod-ucsi-acpi.ko \
kmod-udmabuf.ko \
kmod-udp-diag.ko \
kmod-udp-tunnel.ko \
kmod-uhci-hcd.ko \
kmod-ums-alauda.ko \
kmod-ums-cypress.ko \
kmod-ums-datafab.ko \
kmod-ums-eneub6250.ko \
kmod-ums-freecom.ko \
kmod-ums-isd200.ko \
kmod-ums-jumpshot.ko \
kmod-ums-karma.ko \
kmod-ums-onetouch.ko \
kmod-ums-realtek.ko \
kmod-ums-sddr09.ko \
kmod-ums-sddr55.ko \
kmod-ums-usbat.ko \
kmod-unicode.ko \
kmod-unix-diag.ko \
kmod-unix.ko \
kmod-usb-common.ko \
kmod-usb-storage.ko \
kmod-usbcore.ko \
kmod-usbhid.ko \
kmod-utf8data.ko \
kmod-vdpa.ko \
kmod-veth.ko \
kmod-vexpress-config.ko \
kmod-vexpress-sysreg.ko \
kmod-vfat.ko \
kmod-vid-pll-div.ko \
kmod-virtio-balloon.ko \
kmod-virtio-blk.ko \
kmod-virtio-bt.ko \
kmod-virtio-console.ko \
kmod-virtio-crypto.ko \
kmod-virtio-dma-buf.ko \
kmod-virtio-gpu.ko \
kmod-virtio-input.ko \
kmod-virtio-iommu.ko \
kmod-virtio-mem.ko \
kmod-virtio-mmio.ko \
kmod-virtio-net.ko \
kmod-virtio-pci-legacy-dev.ko \
kmod-virtio-pci-modern-dev.ko \
kmod-virtio-pci.ko \
kmod-virtio-pmem.ko \
kmod-virtio-ring.ko \
kmod-virtio-rng.ko \
kmod-virtio-rpmsg-bus.ko \
kmod-virtio-scsi.ko \
kmod-virtio-snd.ko \
kmod-virtio-vdpa.ko \
kmod-virtio.ko \
kmod-vivaldi-fmap.ko \
kmod-vmac.ko \
kmod-vmw-vmci.ko \
kmod-vmw-vsock-virtio-transport-common.ko \
kmod-vmw-vsock-virtio-transport.ko \
kmod-vmw-vsock-vmci-transport.ko \
kmod-vmxnet3.ko \
kmod-vp-vdpa.ko \
kmod-vport-geneve.ko \
kmod-vport-gre.ko \
kmod-vport-vxlan.ko \
kmod-vsock-diag.ko \
kmod-vsock-loopback.ko \
kmod-vsock.ko \
kmod-vxlan.ko \
kmod-watch-queue.ko \
kmod-watchdog.ko \
kmod-wireguard.ko \
kmod-wp512.ko \
kmod-wwan.ko \
kmod-x-tables.ko \
kmod-x509-key-parser.ko \
kmod-xcbc.ko \
kmod-xctr.ko \
kmod-xfrm-algo.ko \
kmod-xfrm-interface.ko \
kmod-xfrm-ipcomp.ko \
kmod-xfrm-user.ko \
kmod-xfrm4-tunnel.ko \
kmod-xfrm6-tunnel.ko \
kmod-xfs.ko \
kmod-xgene-enet-v2.ko \
kmod-xgene-enet.ko \
kmod-xgmac-mdio.ko \
kmod-xhci-hcd.ko \
kmod-xhci-pci-renesas.ko \
kmod-xhci-pci.ko \
kmod-xilinx-uartps.ko \
kmod-xor-neon.ko \
kmod-xor.ko \
kmod-xt-AUDIT.ko \
kmod-xt-CHECKSUM.ko \
kmod-xt-CLASSIFY.ko \
kmod-xt-CONNSECMARK.ko \
kmod-xt-CT.ko \
kmod-xt-DSCP.ko \
kmod-xt-HL.ko \
kmod-xt-HMARK.ko \
kmod-xt-IDLETIMER.ko \
kmod-xt-LED.ko \
kmod-xt-LOG.ko \
kmod-xt-MASQUERADE.ko \
kmod-xt-NETMAP.ko \
kmod-xt-NFLOG.ko \
kmod-xt-NFQUEUE.ko \
kmod-xt-RATEEST.ko \
kmod-xt-REDIRECT.ko \
kmod-xt-SECMARK.ko \
kmod-xt-TCPMSS.ko \
kmod-xt-TCPOPTSTRIP.ko \
kmod-xt-TEE.ko \
kmod-xt-TPROXY.ko \
kmod-xt-TRACE.ko \
kmod-xt-addrtype.ko \
kmod-xt-bpf.ko \
kmod-xt-cgroup.ko \
kmod-xt-cluster.ko \
kmod-xt-comment.ko \
kmod-xt-connbytes.ko \
kmod-xt-connlabel.ko \
kmod-xt-connlimit.ko \
kmod-xt-connmark.ko \
kmod-xt-conntrack.ko \
kmod-xt-cpu.ko \
kmod-xt-dccp.ko \
kmod-xt-devgroup.ko \
kmod-xt-dscp.ko \
kmod-xt-ecn.ko \
kmod-xt-esp.ko \
kmod-xt-hashlimit.ko \
kmod-xt-helper.ko \
kmod-xt-hl.ko \
kmod-xt-ipcomp.ko \
kmod-xt-iprange.ko \
kmod-xt-ipvs.ko \
kmod-xt-l2tp.ko \
kmod-xt-length.ko \
kmod-xt-limit.ko \
kmod-xt-mac.ko \
kmod-xt-mark.ko \
kmod-xt-multiport.ko \
kmod-xt-nat.ko \
kmod-xt-nfacct.ko \
kmod-xt-osf.ko \
kmod-xt-owner.ko \
kmod-xt-physdev.ko \
kmod-xt-pkttype.ko \
kmod-xt-policy.ko \
kmod-xt-quota.ko \
kmod-xt-rateest.ko \
kmod-xt-realm.ko \
kmod-xt-recent.ko \
kmod-xt-sctp.ko \
kmod-xt-set.ko \
kmod-xt-socket.ko \
kmod-xt-state.ko \
kmod-xt-statistic.ko \
kmod-xt-string.ko \
kmod-xt-tcpmss.ko \
kmod-xt-tcpudp.ko \
kmod-xt-time.ko \
kmod-xt-u32.ko \
kmod-xts.ko \
kmod-xxhash-generic.ko \
kmod-xxhash.ko \
kmod-xz-dec.ko \
kmod-zbud.ko \
kmod-zlib-deflate.ko \
kmod-zlib-inflate.ko \
kmod-zpool.ko \
kmod-zsmalloc.ko \
kmod-zstd-common.ko \
kmod-zstd-compress.ko \
kmod-zstd-decompress.ko \
kmod-zstd.ko \
kmod-zswap.ko \
kmod-zynqmp-ipi-mailbox.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
awk \
coreutils \
distribution-release \
dracut \
kmod-zstd \
modutils \
perl-Bootloader \
suse-kernel-rpm-scriptlets \
suse-module-tools"

inherit rpm
