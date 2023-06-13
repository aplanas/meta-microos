SUMMARY = "Embedded Perl for Apache"
DESCRIPTION = "The Apache/Perl integration project brings together the full power of \
the Perl programming language and the Apache HTTP server. \
 \
With mod_perl, it is possible to write Apache modules entirely in Perl. \
The persistent interpreter embedded in the server avoids the overhead \
of starting an external interpreter and the penalty of Perl start-up \
time. \
 \
Note that you do not need mod_perl to run perl scripts via the common \
gateway interface (CGI). mod_perl enables you to run Perl scripts in an \
embedded interpreter if the additional performance is needed, but may \
require modifications to the scripts."
LICENSE = "Apache-2.0"

PV = "2.0.12"

RPM_NAME = "apache2-mod_perl-2.0.12-1.8.aarch64.rpm"
RPM_HASH = "5968eed57f48ec23df4e14d971d9c908a5dfee1c4b3927bdbcce031baa6bb3f649e25eadd34cc6bfab2791061192f529b210c30d5c246d4c1d5559309f298647"

RPROVIDES:${PN} += "apache2-mod_perl \
apache2-mod_perl(aarch-64) \
config(apache2-mod_perl) \
perl(APR) \
perl(APR::Base64) \
perl(APR::Brigade) \
perl(APR::Bucket) \
perl(APR::BucketAlloc) \
perl(APR::BucketType) \
perl(APR::Const) \
perl(APR::Date) \
perl(APR::Error) \
perl(APR::Finfo) \
perl(APR::IpSubnet) \
perl(APR::OS) \
perl(APR::PerlIO) \
perl(APR::Pool) \
perl(APR::SockAddr) \
perl(APR::Socket) \
perl(APR::Status) \
perl(APR::String) \
perl(APR::Table) \
perl(APR::ThreadMutex) \
perl(APR::ThreadRWLock) \
perl(APR::URI) \
perl(APR::UUID) \
perl(APR::Util) \
perl(APR::XSLoader) \
perl(Apache) \
perl(Apache2::Access) \
perl(Apache2::Build) \
perl(Apache2::BuildConfig) \
perl(Apache2::CmdParms) \
perl(Apache2::Command) \
perl(Apache2::Connection) \
perl(Apache2::ConnectionUtil) \
perl(Apache2::Const) \
perl(Apache2::Directive) \
perl(Apache2::Filter) \
perl(Apache2::FilterRec) \
perl(Apache2::HookRun) \
perl(Apache2::Log) \
perl(Apache2::MPM) \
perl(Apache2::Module) \
perl(Apache2::ParseSource) \
perl(Apache2::ParseSource::Scan) \
perl(Apache2::PerlSections) \
perl(Apache2::PerlSections::Dump) \
perl(Apache2::Process) \
perl(Apache2::Provider) \
perl(Apache2::Reload) \
perl(Apache2::RequestIO) \
perl(Apache2::RequestRec) \
perl(Apache2::RequestUtil) \
perl(Apache2::Resource) \
perl(Apache2::Response) \
perl(Apache2::ServerRec) \
perl(Apache2::ServerUtil) \
perl(Apache2::SizeLimit) \
perl(Apache2::SourceTables) \
perl(Apache2::Status) \
perl(Apache2::Status::_version) \
perl(Apache2::SubProcess) \
perl(Apache2::SubRequest) \
perl(Apache2::URI) \
perl(Apache2::Util) \
perl(Apache2::XSLoader) \
perl(Apache2::compat) \
perl(Apache2::porting) \
perl(Apache::Constants) \
perl(Apache::File) \
perl(Apache::Reload) \
perl(Apache::SIG) \
perl(Apache::Server) \
perl(Apache::SizeLimit) \
perl(Apache::SizeLimit::Core) \
perl(Apache::Table) \
perl(Apache::Test) \
perl(Apache::Test5005compat) \
perl(Apache::TestBuild) \
perl(Apache::TestClient) \
perl(Apache::TestClientResponse) \
perl(Apache::TestCommon) \
perl(Apache::TestCommonPost) \
perl(Apache::TestConfig) \
perl(Apache::TestConfigC) \
perl(Apache::TestConfigPHP) \
perl(Apache::TestConfigParrot) \
perl(Apache::TestHandler) \
perl(Apache::TestHarness) \
perl(Apache::TestHarnessPHP) \
perl(Apache::TestMB) \
perl(Apache::TestMM) \
perl(Apache::TestReport) \
perl(Apache::TestReportPerl) \
perl(Apache::TestRequest) \
perl(Apache::TestRun) \
perl(Apache::TestRunPHP) \
perl(Apache::TestRunParrot) \
perl(Apache::TestRunPerl) \
perl(Apache::TestSSLCA) \
perl(Apache::TestServer) \
perl(Apache::TestSmoke) \
perl(Apache::TestSmokePerl) \
perl(Apache::TestSort) \
perl(Apache::TestToString) \
perl(Apache::TestTrace) \
perl(Apache::TestUtil) \
perl(Apache::Util) \
perl(Bundle::Apache2) \
perl(Bundle::ApacheTest) \
perl(C::Preprocessed) \
perl(ModPerl::BuildMM) \
perl(ModPerl::BuildOptions) \
perl(ModPerl::CScan) \
perl(ModPerl::Code) \
perl(ModPerl::Config) \
perl(ModPerl::Const) \
perl(ModPerl::FunctionMap) \
perl(ModPerl::Global) \
perl(ModPerl::InterpPool) \
perl(ModPerl::Interpreter) \
perl(ModPerl::MM) \
perl(ModPerl::Manifest) \
perl(ModPerl::MapBase) \
perl(ModPerl::MapUtil) \
perl(ModPerl::MethodLookup) \
perl(ModPerl::ParseSource) \
perl(ModPerl::PerlRun) \
perl(ModPerl::PerlRunPrefork) \
perl(ModPerl::Registry) \
perl(ModPerl::RegistryBB) \
perl(ModPerl::RegistryCooker) \
perl(ModPerl::RegistryLoader) \
perl(ModPerl::RegistryPrefork) \
perl(ModPerl::StructureMap) \
perl(ModPerl::TestConfig) \
perl(ModPerl::TestReport) \
perl(ModPerl::TestRun) \
perl(ModPerl::TiPool) \
perl(ModPerl::TiPoolConfig) \
perl(ModPerl::TypeMap) \
perl(ModPerl::Util) \
perl(ModPerl::WrapXS) \
perl(mod_perl2)"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libperl.so()(64bit) \
perl \
perl(Linux::Pid) \
perl-HTML-Parser \
perl-Tie-IxHash \
perl-URI \
perl-libwww-perl \
suse_maintenance_mmn_0"

inherit rpm
