SUMMARY = "CMPI-based CIM provider implementing DMTF SVPC model"
DESCRIPTION = "Libvirt-cim is a CMPI CIM provider that implements the DMTF SVPC \
virtualization model. The goal is to support most of the features \
exported by libvirt itself, enabling management of multiple platforms \
with a single provider. \
 \
 \
 \
Authors: \
-------- \
    Dan Smith <danms@us.ibm.com>"
LICENSE = "LGPL-2.1+"

PV = "0.6.3"

RPM_NAME = "libvirt-cim-0.6.3-15.4.aarch64.rpm"
RPM_HASH = "07ad571ed53756782f1660a412e51ebf331ec096c2a598dee91c092dd4493c994156b8525e32621305c4058e07a61de68d7bcd3a159578f7f78b16f672a0a10b"

RPROVIDES:${PN} += "config-libvirt-cim \
libVirt-AllocationCapabilities.so.0 \
libVirt-AppliedFilterList.so.0 \
libVirt-ComputerSystem.so.0 \
libVirt-ComputerSystemIndication.so.0 \
libVirt-ComputerSystemMigrationIndication.so.0 \
libVirt-ConcreteComponent.so.0 \
libVirt-ConsoleRedirectionService.so.0 \
libVirt-ConsoleRedirectionServiceCapabilities.so.0 \
libVirt-Device.so.0 \
libVirt-DevicePool.so.0 \
libVirt-ElementAllocatedFromPool.so.0 \
libVirt-ElementCapabilities.so.0 \
libVirt-ElementConformsToProfile.so.0 \
libVirt-ElementSettingData.so.0 \
libVirt-EnabledLogicalElementCapabilities.so.0 \
libVirt-EntriesInFilterList.so.0 \
libVirt-FilterEntry.so.0 \
libVirt-FilterList.so.0 \
libVirt-HostSystem.so.0 \
libVirt-HostedAccessPoint.so.0 \
libVirt-HostedDependency.so.0 \
libVirt-HostedFilterList.so.0 \
libVirt-HostedResourcePool.so.0 \
libVirt-HostedService.so.0 \
libVirt-KVMRedirectionSAP.so.0 \
libVirt-NestedFilterList.so.0 \
libVirt-RASD.so.0 \
libVirt-ReferencedProfile.so.0 \
libVirt-RegisteredProfile.so.0 \
libVirt-ResourceAllocationFromPool.so.0 \
libVirt-ResourceAllocationSettingDataIndication.so.0 \
libVirt-ResourcePoolConfigurationCapabilities.so.0 \
libVirt-ResourcePoolConfigurationService.so.0 \
libVirt-SAPAvailableForElement.so.0 \
libVirt-ServiceAccessBySAP.so.0 \
libVirt-ServiceAffectsElement.so.0 \
libVirt-SettingsDefineCapabilities.so.0 \
libVirt-SettingsDefineState.so.0 \
libVirt-SwitchService.so.0 \
libVirt-SystemDevice.so.0 \
libVirt-VSMigrationCapabilities.so.0 \
libVirt-VSMigrationService.so.0 \
libVirt-VSMigrationSettingData.so.0 \
libVirt-VSSD.so.0 \
libVirt-VSSDComponent.so.0 \
libVirt-VirtualSystemManagementCapabilities.so.0 \
libVirt-VirtualSystemManagementService.so.0 \
libVirt-VirtualSystemSnapshotService.so.0 \
libVirt-VirtualSystemSnapshotServiceCapabilities.so.0 \
libvirt-cim \
libxkutil.so.0 \
xen-cim-cmpi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cim-schema \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmpiutil.so.0 \
libuuid.so.1 \
libvirt.so.0 \
libxml2 \
sblim-sfcb \
systemd \
unzip"

inherit rpm
