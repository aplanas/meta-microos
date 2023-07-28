SUMMARY = "Development package pulling in all build+test dependencies"
DESCRIPTION = "Development package pulling in all build+test dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-devel-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "e69afdf766925d6b14aab44d0a060cb584ba5018692a9d946a227340dd9dd919e8829703e5c0f9034987f8dda617d218e1f254c1df8dc2a708924825674ac80a"

RPROVIDES:${PN} += "openQA-devel"

RDEPENDS:${PN} += "ShellCheck \
bsdtar \
chromedriver \
curl \
git-core \
hostname \
jq \
ntp-daemon \
openQA-client \
optipng \
os-autoinst \
os-autoinst-devel \
perl \
perl-App--cpanminus \
perl-BSD--Resource \
perl-CSS--Minifier--XS \
perl-Capture--Tiny \
perl-Carp \
perl-Carp--Always \
perl-CommonMark \
perl-Config--IniFiles \
perl-Config--Tiny \
perl-Cpanel--JSON--XS \
perl-Cwd \
perl-DBD--Pg \
perl-DBI \
perl-DBIx--Class \
perl-DBIx--Class--DeploymentHandler \
perl-DBIx--Class--DynamicDefault \
perl-DBIx--Class--OptimisticLocking \
perl-DBIx--Class--ResultClass--HashRefInflator \
perl-DBIx--Class--Schema--Config \
perl-DBIx--Class--Storage--Statistics \
perl-Data--Dump \
perl-Data--Dumper \
perl-Date--Format \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Format--Pg \
perl-Devel--Cover \
perl-Devel--Cover--Report--Codecovbash \
perl-Digest--MD5 \
perl-Exporter \
perl-Fcntl \
perl-File--Basename \
perl-File--Copy \
perl-File--Copy--Recursive \
perl-File--Map \
perl-File--Path \
perl-File--Spec \
perl-Filesys--Df \
perl-FindBin \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-IO--Handle \
perl-IPC--Run \
perl-JSON--Validator \
perl-JavaScript--Minifier--XS \
perl-LWP--UserAgent \
perl-Minion \
perl-Minion--Backend--SQLite \
perl-Module--Load--Conditional \
perl-Module--Pluggable \
perl-Mojo--Base \
perl-Mojo--ByteStream \
perl-Mojo--IOLoop \
perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--JSON \
perl-Mojo--Pg \
perl-Mojo--RabbitMQ--Client \
perl-Mojo--SQLite \
perl-Mojo--URL \
perl-Mojo--Util \
perl-Mojolicious \
perl-Mojolicious--Commands \
perl-Mojolicious--Plugin \
perl-Mojolicious--Plugin--AssetPack \
perl-Mojolicious--Plugin--OAuth2 \
perl-Mojolicious--Static \
perl-Net--OpenID--Consumer \
perl-POSIX \
perl-Perl--Critic \
perl-Perl--Critic--Freenode \
perl-Perl--Tidy \
perl-Pod--POM \
perl-Regexp--Common \
perl-SQL--Translator \
perl-Scalar--Util \
perl-Selenium--Remote--Driver \
perl-Selenium--Remote--WDKeys \
perl-Sort--Versions \
perl-Storable \
perl-Test--Exception \
perl-Test--Fatal \
perl-Test--MockModule \
perl-Test--MockObject \
perl-Test--Mojo \
perl-Test--Most \
perl-Test--Output \
perl-Test--Pod \
perl-Test--Strict \
perl-Test--Warnings \
perl-Text--Diff \
perl-Time--HiRes \
perl-Time--Moment \
perl-Time--ParseDate \
perl-Time--Piece \
perl-Time--Seconds \
perl-Try--Tiny \
perl-URI--Escape \
perl-YAML--PP \
perl-YAML--XS \
perl-aliased \
perl-base \
perl-constant \
perl-diagnostics \
perl-strict \
perl-warnings \
postgresql-devel \
postgresql-server \
psmisc \
python3-base \
python3-requests \
python3-setuptools \
python3-yamllint \
qemu \
rsync \
rubygem-sass \
sqlite3 \
sudo \
tar \
xorg-x11-fonts"

inherit rpm
