SUMMARY = "OS-level test automation"
DESCRIPTION = "The OS-autoinst project aims at providing a means to run fully \
automated tests. Especially to run tests of basic and low-level \
operating system components such as bootloader, kernel, installer \
and upgrade, which can not easily and safely be tested with other \
automated testing frameworks. However, it can just as well be used \
to test firefox and openoffice operation on top of a newly \
installed OS."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683886197.05274f7"

RPM_NAME = "os-autoinst-4.6.1683886197.05274f7-1.1.aarch64.rpm"
RPM_HASH = "ba6cf56af50de4e199c7323bc0767f698e057aa2b0724d3e36af4b767f05a518b777450587c4f2df15f8d784e4b3984780ff8c484dd92edd219941a5df106b4b"

RPROVIDES:${PN} += "os-autoinst \
os-autoinst(aarch-64) \
perl(OpenQA::Benchmark::Stopwatch) \
perl(OpenQA::Commands) \
perl(OpenQA::Exceptions) \
perl(OpenQA::Isotovideo::Backend) \
perl(OpenQA::Isotovideo::CommandHandler) \
perl(OpenQA::Isotovideo::Interface) \
perl(OpenQA::Isotovideo::NeedleDownloader) \
perl(OpenQA::Isotovideo::Runner) \
perl(OpenQA::Isotovideo::Utils) \
perl(OpenQA::NamedIOSelect) \
perl(OpenQA::Qemu::BlockDev) \
perl(OpenQA::Qemu::BlockDevConf) \
perl(OpenQA::Qemu::ControllerConf) \
perl(OpenQA::Qemu::DriveController) \
perl(OpenQA::Qemu::DriveDevice) \
perl(OpenQA::Qemu::DrivePath) \
perl(OpenQA::Qemu::MutParams) \
perl(OpenQA::Qemu::PFlashDevice) \
perl(OpenQA::Qemu::Proc) \
perl(OpenQA::Qemu::Snapshot) \
perl(OpenQA::Qemu::SnapshotConf) \
perl(OpenQA::Test::RunArgs) \
perl(autotest) \
perl(backend::amt) \
perl(backend::baseclass) \
perl(backend::console_proxy) \
perl(backend::driver) \
perl(backend::generalhw) \
perl(backend::ipmi) \
perl(backend::null) \
perl(backend::pvm_hmc) \
perl(backend::qemu) \
perl(backend::s390x) \
perl(backend::spvm) \
perl(backend::svirt) \
perl(backend::vagrant) \
perl(backend::virt) \
perl(basetest) \
perl(bmwqemu) \
perl(bmwqemu::tiedvars) \
perl(commands) \
perl(consoles::VMWare) \
perl(consoles::VNC) \
perl(consoles::amtSol) \
perl(consoles::console) \
perl(consoles::ipmiSol) \
perl(consoles::localXvnc) \
perl(consoles::network_console) \
perl(consoles::s3270) \
perl(consoles::serial_screen) \
perl(consoles::sshIucvconn) \
perl(consoles::sshSerial) \
perl(consoles::sshVirtsh) \
perl(consoles::sshVirtshSUT) \
perl(consoles::sshX3270) \
perl(consoles::sshXtermIPMI) \
perl(consoles::sshXtermVt) \
perl(consoles::ssh_screen) \
perl(consoles::ttyConsole) \
perl(consoles::video_base) \
perl(consoles::video_stream) \
perl(consoles::virtio_terminal) \
perl(consoles::vnc_base) \
perl(cv) \
perl(distribution) \
perl(lockapi) \
perl(log) \
perl(mmapi) \
perl(myjsonrpc) \
perl(needle) \
perl(ocr) \
perl(osutils) \
perl(signalblocker) \
perl(testapi) \
perl(tinycv) \
perl(tinycv::Image)"
RDEPENDS:${PN} += "/usr/bin/getent \
/usr/bin/perl \
/usr/sbin/useradd \
git-core \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libogg.so.0()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_highgui.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libtheoraenc.so.1()(64bit) \
libtheoraenc.so.1(libtheoraenc_1.0)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(B::Deparse) \
perl(Carp) \
perl(Carp::Always) \
perl(Config) \
perl(Cpanel::JSON::XS) \
perl(Crypt::DES) \
perl(Cwd) \
perl(Data::Dumper) \
perl(Digest::MD5) \
perl(DynaLoader) \
perl(English) \
perl(Errno) \
perl(Exception::Class) \
perl(Exporter) \
perl(ExtUtils::testlib) \
perl(Fcntl) \
perl(File::Basename) \
perl(File::Find) \
perl(File::Path) \
perl(File::Temp) \
perl(File::Touch) \
perl(File::Which) \
perl(File::chdir) \
perl(IO::Handle) \
perl(IO::Scalar) \
perl(IO::Select) \
perl(IO::Socket) \
perl(IO::Socket::INET) \
perl(IO::Socket::UNIX) \
perl(IPC::Open3) \
perl(IPC::Run::Debug) \
perl(IPC::System::Simple) \
perl(JSON::Validator) \
perl(List::MoreUtils) \
perl(List::Util) \
perl(Mojo::IOLoop::ReadWriteProcess) \
perl(Mojo::JSON) \
perl(Mojo::Log) \
perl(Mojo::URL) \
perl(Mojo::UserAgent) \
perl(Mojolicious) \
perl(Mojolicious::Lite) \
perl(Net::DBus) \
perl(Net::Domain) \
perl(Net::IP) \
perl(Net::SNMP) \
perl(Net::SSH2) \
perl(POSIX) \
perl(Scalar::Util) \
perl(Socket) \
perl(Socket::MsgHdr) \
perl(Term::ANSIColor) \
perl(Thread::Queue) \
perl(Time::HiRes) \
perl(Time::Moment) \
perl(Time::Seconds) \
perl(Try::Tiny) \
perl(XML::LibXML) \
perl(XML::SemanticDiff) \
perl(YAML::PP) \
perl(YAML::XS) \
perl(autodie) \
perl(base) \
perl(constant) \
perl(integer) \
perl(strict) \
perl(version) \
perl(warnings) \
perl-base"

inherit rpm