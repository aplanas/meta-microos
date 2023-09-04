SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-worker-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "a457061807084bd33c8b41bc785739f20d0bb880d4bbf8a83076864b3ad4eab82b62405bdad599643f03ede2148dd0cff3a1c78381f1a65b9b00c9da4256c619"

RPROVIDES:${PN} += "config-openQA-worker \
group--openqa-worker \
openQA-worker \
perl-OpenQA--CacheService--Client \
perl-OpenQA--CacheService--Command--run \
perl-OpenQA--CacheService--Controller--API \
perl-OpenQA--CacheService--Controller--Influxdb \
perl-OpenQA--CacheService--Model--Cache \
perl-OpenQA--CacheService--Model--Downloads \
perl-OpenQA--CacheService--Plugin--Helpers \
perl-OpenQA--CacheService--Request \
perl-OpenQA--CacheService--Request--Asset \
perl-OpenQA--CacheService--Request--Sync \
perl-OpenQA--CacheService--Response \
perl-OpenQA--CacheService--Response--Info \
perl-OpenQA--CacheService--Response--Status \
perl-OpenQA--CacheService--Task--Asset \
perl-OpenQA--CacheService--Task--Sync \
perl-OpenQA--Worker--App \
perl-OpenQA--Worker--CommandHandler \
perl-OpenQA--Worker--Engines--isotovideo \
perl-OpenQA--Worker--Isotovideo--Client \
perl-OpenQA--Worker--Job \
perl-OpenQA--Worker--Settings \
perl-OpenQA--Worker--WebUIConnection \
user--openqa-worker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bsdtar \
coreutils \
group-nogroup \
openQA-client \
openQA-common \
optipng \
os-autoinst \
perl-Capture--Tiny \
perl-File--Map \
perl-Minion--Backend--SQLite \
perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--SQLite \
perl-SQL--SplitStatement \
psmisc \
sqlite3"

inherit rpm
