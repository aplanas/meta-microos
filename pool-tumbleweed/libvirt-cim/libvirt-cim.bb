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

RPM_NAME = "libvirt-cim-0.6.3-15.3.aarch64.rpm"
RPM_HASH = "4d13f3966ca29025d03b1e890411d64a3b20bb3fb0f04635c79c834a962d9ce8421a57f1f60233aeea420cec321d04d445aaabacc3148422474bd986122017bb"

RPROVIDES:${PN} += "config(libvirt-cim) \
libVirt_AllocationCapabilities.so.0()(64bit) \
libVirt_AppliedFilterList.so.0()(64bit) \
libVirt_ComputerSystem.so.0()(64bit) \
libVirt_ComputerSystemIndication.so.0()(64bit) \
libVirt_ComputerSystemMigrationIndication.so.0()(64bit) \
libVirt_ConcreteComponent.so.0()(64bit) \
libVirt_ConsoleRedirectionService.so.0()(64bit) \
libVirt_ConsoleRedirectionServiceCapabilities.so.0()(64bit) \
libVirt_Device.so.0()(64bit) \
libVirt_DevicePool.so.0()(64bit) \
libVirt_ElementAllocatedFromPool.so.0()(64bit) \
libVirt_ElementCapabilities.so.0()(64bit) \
libVirt_ElementConformsToProfile.so.0()(64bit) \
libVirt_ElementSettingData.so.0()(64bit) \
libVirt_EnabledLogicalElementCapabilities.so.0()(64bit) \
libVirt_EntriesInFilterList.so.0()(64bit) \
libVirt_FilterEntry.so.0()(64bit) \
libVirt_FilterList.so.0()(64bit) \
libVirt_HostSystem.so.0()(64bit) \
libVirt_HostedAccessPoint.so.0()(64bit) \
libVirt_HostedDependency.so.0()(64bit) \
libVirt_HostedFilterList.so.0()(64bit) \
libVirt_HostedResourcePool.so.0()(64bit) \
libVirt_HostedService.so.0()(64bit) \
libVirt_KVMRedirectionSAP.so.0()(64bit) \
libVirt_NestedFilterList.so.0()(64bit) \
libVirt_RASD.so.0()(64bit) \
libVirt_ReferencedProfile.so.0()(64bit) \
libVirt_RegisteredProfile.so.0()(64bit) \
libVirt_ResourceAllocationFromPool.so.0()(64bit) \
libVirt_ResourceAllocationSettingDataIndication.so.0()(64bit) \
libVirt_ResourcePoolConfigurationCapabilities.so.0()(64bit) \
libVirt_ResourcePoolConfigurationService.so.0()(64bit) \
libVirt_SAPAvailableForElement.so.0()(64bit) \
libVirt_ServiceAccessBySAP.so.0()(64bit) \
libVirt_ServiceAffectsElement.so.0()(64bit) \
libVirt_SettingsDefineCapabilities.so.0()(64bit) \
libVirt_SettingsDefineState.so.0()(64bit) \
libVirt_SwitchService.so.0()(64bit) \
libVirt_SystemDevice.so.0()(64bit) \
libVirt_VSMigrationCapabilities.so.0()(64bit) \
libVirt_VSMigrationService.so.0()(64bit) \
libVirt_VSMigrationSettingData.so.0()(64bit) \
libVirt_VSSD.so.0()(64bit) \
libVirt_VSSDComponent.so.0()(64bit) \
libVirt_VirtualSystemManagementCapabilities.so.0()(64bit) \
libVirt_VirtualSystemManagementService.so.0()(64bit) \
libVirt_VirtualSystemSnapshotService.so.0()(64bit) \
libVirt_VirtualSystemSnapshotServiceCapabilities.so.0()(64bit) \
libvirt-cim \
libvirt-cim(aarch-64) \
libxkutil.so.0()(64bit) \
xen-cim-cmpi"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
cim-schema \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcmpiutil.so.0()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.9)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.3)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libxml2 \
sblim-sfcb \
systemd \
unzip"

inherit rpm
