SUMMARY = "Development package pulling in all build+test dependencies"
DESCRIPTION = "Development package pulling in all build+test dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693332527.fb060dc"

RPM_NAME = "os-autoinst-devel-4.6.1693332527.fb060dc-1.1.aarch64.rpm"
RPM_HASH = "9acaa47da2e902bf285b4d2cff4841c658547e6e119404a6cb29ce3e95c910e4956a31586963ffdc2639fd5b2042ff2b35589c2b9cc27fba7ecbb9d0af491e24"

RPROVIDES:${PN} += "os-autoinst-devel"

RDEPENDS:${PN} += "ShellCheck \
aspell-en \
aspell-spell \
cmake \
cpio \
gcc-c++ \
git-core \
icewm \
ninja \
perl-B--Deparse \
perl-Benchmark \
perl-Carp \
perl-Carp--Always \
perl-Code--TidyAll \
perl-Config \
perl-Cpanel--JSON--XS \
perl-Crypt--DES \
perl-Cwd \
perl-Data--Dumper \
perl-Devel--Cover \
perl-Devel--Cover--Report--Codecov \
perl-Digest--MD5 \
perl-DynaLoader \
perl-English \
perl-Errno \
perl-Exception--Class \
perl-Exporter \
perl-ExtUtils--testlib \
perl-Fcntl \
perl-File--Basename \
perl-File--Find \
perl-File--Path \
perl-File--Temp \
perl-File--Touch \
perl-File--Which \
perl-File--chdir \
perl-FindBin \
perl-IO--Handle \
perl-IO--Scalar \
perl-IO--Select \
perl-IO--Socket \
perl-IO--Socket--INET \
perl-IO--Socket--UNIX \
perl-IPC--Open3 \
perl-IPC--Run--Debug \
perl-IPC--System--Simple \
perl-Inline--Python \
perl-JSON--Validator \
perl-List--MoreUtils \
perl-List--Util \
perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--JSON \
perl-Mojo--Log \
perl-Mojo--URL \
perl-Mojo--UserAgent \
perl-Mojolicious \
perl-Mojolicious--Lite \
perl-Net--DBus \
perl-Net--Domain \
perl-Net--IP \
perl-Net--SNMP \
perl-Net--SSH2 \
perl-POSIX \
perl-Perl--Tidy \
perl-Pod--Coverage \
perl-Pod--Html \
perl-Pod--Spell \
perl-Scalar--Util \
perl-Socket \
perl-Socket--MsgHdr \
perl-Template--Toolkit \
perl-Term--ANSIColor \
perl-Test--Fatal \
perl-Test--Mock--Time \
perl-Test--MockModule \
perl-Test--MockObject \
perl-Test--MockRandom \
perl-Test--Mojo \
perl-Test--Most \
perl-Test--Output \
perl-Test--Pod \
perl-Test--Strict \
perl-Test--Warnings \
perl-Thread--Queue \
perl-Time--HiRes \
perl-Time--Moment \
perl-Time--Seconds \
perl-Try--Tiny \
perl-XML--LibXML \
perl-XML--SemanticDiff \
perl-YAML--PP \
perl-YAML--XS \
perl-autodie \
perl-base \
perl-constant \
perl-integer \
perl-strict \
perl-version \
perl-warnings \
pkg-config \
pkgconfig-fftw3 \
pkgconfig-libpng \
pkgconfig-opencv4 \
pkgconfig-sndfile \
pkgconfig-theoraenc \
procps \
python3-Pillow-tk \
python3-black \
python3-setuptools \
qemu \
qemu-tools \
qemu-x86 \
tesseract-ocr \
tesseract-ocr-traineddata-english \
xorg-x11-Xvnc \
xterm \
xterm-console"

inherit rpm
