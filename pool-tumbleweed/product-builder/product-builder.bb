SUMMARY = "SUSE Product Builder"
DESCRIPTION = "The SUSE product builder, builds product media (CD/DVD) for \
the SUSE product portfolio. Based on kiwi perl implementation. \
 \
To be used only for product medias for Leap 15 and SLE 15."
LICENSE = "GPL-2.0-only"

PV = "1.4.13"

RPM_NAME = "product-builder-1.4.13-1.2.aarch64.rpm"
RPM_HASH = "87d2625d48b384c214d466864fb92ff44cd1050aac8b6015d2e8e682b6a728b33d87015fbb8bbf11729dda8d9e6f022034d762e975c67693a728dd05a1eaf0f8"

RPROVIDES:${PN} += "kiwi-packagemanager-instsource \
kiwi-schema \
perl-KIWIArch \
perl-KIWIArchList \
perl-KIWICollect \
perl-KIWICommandLine \
perl-KIWIGlobals \
perl-KIWIIsoLinux \
perl-KIWILocator \
perl-KIWILog \
perl-KIWIProductData \
perl-KIWIQX \
perl-KIWIRepoMetaHandler \
perl-KIWITrace \
perl-KIWIURL \
perl-KIWIUtil \
perl-KIWIXML \
perl-KIWIXMLDataBase \
perl-KIWIXMLDefStripData \
perl-KIWIXMLDescriptionData \
perl-KIWIXMLDriverData \
perl-KIWIXMLExceptData \
perl-KIWIXMLFileData \
perl-KIWIXMLInstRepositoryData \
perl-KIWIXMLOEMConfigData \
perl-KIWIXMLPXEDeployConfigData \
perl-KIWIXMLPXEDeployData \
perl-KIWIXMLPackageArchiveData \
perl-KIWIXMLPackageCollectData \
perl-KIWIXMLPackageData \
perl-KIWIXMLPackageIgnoreData \
perl-KIWIXMLPackageProductData \
perl-KIWIXMLPreferenceData \
perl-KIWIXMLProductArchitectureData \
perl-KIWIXMLProductMetaChrootData \
perl-KIWIXMLProductMetaFileData \
perl-KIWIXMLProductOptionsData \
perl-KIWIXMLProductPackageData \
perl-KIWIXMLProfileData \
perl-KIWIXMLRepositoryBaseData \
perl-KIWIXMLRepositoryData \
perl-KIWIXMLSplitData \
perl-KIWIXMLStripData \
perl-KIWIXMLSystemdiskData \
perl-KIWIXMLTypeData \
perl-KIWIXMLUserData \
perl-KIWIXMLVMachineData \
perl-KIWIXMLVagrantConfigData \
perl-KIWIXMLValidator \
product-builder \
system-packages-kiwi-product"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
build \
checkmedia \
inst-source-utils \
libxslt \
mkisofs \
perl \
perl-Class-Singleton \
perl-Config-IniFiles \
perl-File-Slurp \
perl-JSON \
perl-Readonly \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX \
perl-libwww-perl \
product-builder-plugin"

inherit rpm
