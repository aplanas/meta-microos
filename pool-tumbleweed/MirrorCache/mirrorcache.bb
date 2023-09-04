SUMMARY = "WebApp to redirect and manage mirrors"
DESCRIPTION = "Mirror redirector web service, which automatically scans the main server and mirrors"
LICENSE = "GPL-2.0-or-later"

PV = "1.062"

RPM_NAME = "MirrorCache-1.062-1.1.noarch.rpm"
RPM_HASH = "af20d6c2dc5bd6f145e703b01fd53357f88349a2ba5ca3fd6e1d792ef39366e0a772358e43932f1edd871c0e84a3f130653b82c59e5c5840e9aa21b23581cd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MirrorCache \
group-mirrorcache \
perl-DBIx--Class--Timestamps \
perl-Digest--Meta4 \
perl-Digest--Metalink \
perl-Digest--Zsync \
perl-MirrorCache \
perl-MirrorCache--App \
perl-MirrorCache--Auth--Fake \
perl-MirrorCache--Auth--OpenID \
perl-MirrorCache--Config \
perl-MirrorCache--Datamodule \
perl-MirrorCache--Events \
perl-MirrorCache--Schema \
perl-MirrorCache--Schema--Result--Acc \
perl-MirrorCache--Schema--Result--AuditEvent \
perl-MirrorCache--Schema--Result--File \
perl-MirrorCache--Schema--Result--Folder \
perl-MirrorCache--Schema--Result--FolderDiff \
perl-MirrorCache--Schema--Result--FolderDiffFile \
perl-MirrorCache--Schema--Result--FolderDiffServer \
perl-MirrorCache--Schema--Result--Hash \
perl-MirrorCache--Schema--Result--MyServer \
perl-MirrorCache--Schema--Result--Project \
perl-MirrorCache--Schema--Result--Redirect \
perl-MirrorCache--Schema--Result--Server \
perl-MirrorCache--Schema--Result--ServerAdmin \
perl-MirrorCache--Schema--Result--ServerCapabilityDeclaration \
perl-MirrorCache--Schema--Result--Stat \
perl-MirrorCache--Schema--Result--Subsidiary \
perl-MirrorCache--Schema--ResultSet--Acc \
perl-MirrorCache--Schema--ResultSet--AuditEvent \
perl-MirrorCache--Schema--ResultSet--File \
perl-MirrorCache--Schema--ResultSet--Folder \
perl-MirrorCache--Schema--ResultSet--FolderDiffServer \
perl-MirrorCache--Schema--ResultSet--Hash \
perl-MirrorCache--Schema--ResultSet--Project \
perl-MirrorCache--Schema--ResultSet--Server \
perl-MirrorCache--Schema--ResultSet--ServerCapabilityDeclaration \
perl-MirrorCache--Schema--ResultSet--Stat \
perl-MirrorCache--Task--Cleanup \
perl-MirrorCache--Task--FolderHashesCreate \
perl-MirrorCache--Task--FolderHashesImport \
perl-MirrorCache--Task--FolderSync \
perl-MirrorCache--Task--FolderSyncSchedule \
perl-MirrorCache--Task--FolderSyncScheduleFromMisses \
perl-MirrorCache--Task--FolderTree \
perl-MirrorCache--Task--MirrorCheckFromStat \
perl-MirrorCache--Task--MirrorLocation \
perl-MirrorCache--Task--MirrorProbe \
perl-MirrorCache--Task--MirrorProviderSync \
perl-MirrorCache--Task--MirrorScan \
perl-MirrorCache--Task--MirrorScanSchedule \
perl-MirrorCache--Task--MirrorScanScheduleFromMisses \
perl-MirrorCache--Task--MirrorScanScheduleFromPathErrors \
perl-MirrorCache--Task--Report \
perl-MirrorCache--Task--StatAggSchedule \
perl-MirrorCache--Utils \
perl-MirrorCache--WebAPI \
perl-MirrorCache--WebAPI--Command--backstage \
perl-MirrorCache--WebAPI--Command--backstage--list \
perl-MirrorCache--WebAPI--Command--backstage--run \
perl-MirrorCache--WebAPI--Controller--Admin--AuditLog \
perl-MirrorCache--WebAPI--Controller--Admin--Folder \
perl-MirrorCache--WebAPI--Controller--Admin--Session \
perl-MirrorCache--WebAPI--Controller--Admin--User \
perl-MirrorCache--WebAPI--Controller--App--Folder \
perl-MirrorCache--WebAPI--Controller--App--Myserver \
perl-MirrorCache--WebAPI--Controller--App--Server \
perl-MirrorCache--WebAPI--Controller--App--Table \
perl-MirrorCache--WebAPI--Controller--Auth \
perl-MirrorCache--WebAPI--Controller--Report--Download \
perl-MirrorCache--WebAPI--Controller--Report--Mirror \
perl-MirrorCache--WebAPI--Controller--Report--Mirrors \
perl-MirrorCache--WebAPI--Controller--Rest--FolderJobs \
perl-MirrorCache--WebAPI--Controller--Rest--MyIp \
perl-MirrorCache--WebAPI--Controller--Rest--Project \
perl-MirrorCache--WebAPI--Controller--Rest--ReportDownload \
perl-MirrorCache--WebAPI--Controller--Rest--ReportMirror \
perl-MirrorCache--WebAPI--Controller--Rest--ServerLocation \
perl-MirrorCache--WebAPI--Controller--Rest--Stat \
perl-MirrorCache--WebAPI--Controller--Rest--Table \
perl-MirrorCache--WebAPI--Controller--Rest--User \
perl-MirrorCache--WebAPI--Controller--Session \
perl-MirrorCache--WebAPI--Plugin--AuditLog \
perl-MirrorCache--WebAPI--Plugin--Backstage \
perl-MirrorCache--WebAPI--Plugin--Dir \
perl-MirrorCache--WebAPI--Plugin--Geolocation \
perl-MirrorCache--WebAPI--Plugin--HashedParams \
perl-MirrorCache--WebAPI--Plugin--Helpers \
perl-MirrorCache--WebAPI--Plugin--Mmdb \
perl-MirrorCache--WebAPI--Plugin--Project \
perl-MirrorCache--WebAPI--Plugin--RenderFileFromMirror \
perl-MirrorCache--WebAPI--Plugin--ReportMirror \
perl-MirrorCache--WebAPI--Plugin--RootLocal \
perl-MirrorCache--WebAPI--Plugin--RootRemote \
perl-MirrorCache--WebAPI--Plugin--Stat \
perl-MirrorCache--WebAPI--Plugin--Subsidiary \
perl-Net--Nslookup6 \
perl-Net--URIProtocols \
user-mirrorcache"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-CSS--Minifier--XS \
perl-Carp \
perl-Config--IniFiles \
perl-DBD--Pg \
perl-DBI \
perl-DBIx--Class \
perl-DBIx--Class--DynamicDefault \
perl-DateTime \
perl-DateTime--Format--Pg \
perl-Digest--SHA \
perl-Encode \
perl-Exporter \
perl-File--Basename \
perl-IO--Socket--SSL \
perl-JavaScript--Minifier--XS \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Minion \
perl-Mojo--Base \
perl-Mojo--ByteStream \
perl-Mojo--IOLoop \
perl-Mojo--JSON \
perl-Mojo--Pg \
perl-Mojo--URL \
perl-Mojo--Util \
perl-Mojolicious--Commands \
perl-Mojolicious--Plugin \
perl-Mojolicious--Plugin--AssetPack \
perl-Mojolicious--Plugin--RenderFile \
perl-Mojolicious--Static \
perl-Net--DNS \
perl-Net--OpenID--Consumer \
perl-POSIX \
perl-Sort--Versions \
perl-Time--ParseDate \
perl-Time--Piece \
perl-Time--Seconds \
perl-URI--Escape \
perl-XML--Writer \
perl-base \
perl-constant \
perl-diagnostics \
perl-strict \
perl-warnings \
rubygem-sass \
shadow \
sysuser-shadow"

inherit rpm
