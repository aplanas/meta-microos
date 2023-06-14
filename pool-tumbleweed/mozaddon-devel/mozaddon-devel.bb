SUMMARY = "RPM macros for building Mozilla extensions under openSUSE"
DESCRIPTION = "XPI ID retrieval script and helpful RPM macros for packaging up \
addons for the Mozilla suite."
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "mozaddon-devel-1-2.6.noarch.rpm"
RPM_HASH = "91d536a0d177958bb6dbdeb45f3f470ab0fc335e7352faabe9345a6c14561d492d306b739cf4657fb5b106519682f2b99eb71a7ebda7cd647f2ab88c08f90c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozaddon-devel \
rpm-macro-mozilla-addon-install \
rpm-macro-mozilla-addondir \
rpm-macro-mozilla-firefox-appid \
rpm-macro-mozilla-moduledir \
rpm-macro-mozilla-mozillapath \
rpm-macro-mozilla-pluginsdir \
rpm-macro-mozilla-seamonkey-appid \
rpm-macro-mozilla-sunbird-appid \
rpm-macro-mozilla-thunderbird-appid \
rpm-macro-mozilla-unlock-addons"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Archive--Zip \
perl-XML--Simple \
unzip"

inherit rpm
