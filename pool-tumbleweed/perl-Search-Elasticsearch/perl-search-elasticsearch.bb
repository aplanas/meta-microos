SUMMARY = "The official client for Elasticsearch"
DESCRIPTION = "Search::Elasticsearch is the official Perl client for Elasticsearch, \
supported by at http://elastic.co. Elasticsearch itself is a flexible and \
powerful open source, distributed real-time search and analytics engine for \
the cloud. You can read more about it on at http://www.elastic.co."
LICENSE = "Apache-2.0"

PV = "8.00"

RPM_NAME = "perl-Search-Elasticsearch-8.00-1.2.noarch.rpm"
RPM_HASH = "85d2187a91fec7bc6d1ff54b60207f35a8e1be7a5a7a7a661917efebd48d3f3ddc9597c44433c9b6f10ede7606f2c01b1d2041e6fc431b280566150e8422570c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Search::Elasticsearch) \
perl(Search::Elasticsearch::Client::8_0) \
perl(Search::Elasticsearch::Client::8_0::Bulk) \
perl(Search::Elasticsearch::Client::8_0::Direct) \
perl(Search::Elasticsearch::Client::8_0::Direct::Autoscaling) \
perl(Search::Elasticsearch::Client::8_0::Direct::CCR) \
perl(Search::Elasticsearch::Client::8_0::Direct::Cat) \
perl(Search::Elasticsearch::Client::8_0::Direct::Cluster) \
perl(Search::Elasticsearch::Client::8_0::Direct::DanglingIndices) \
perl(Search::Elasticsearch::Client::8_0::Direct::Enrich) \
perl(Search::Elasticsearch::Client::8_0::Direct::Eql) \
perl(Search::Elasticsearch::Client::8_0::Direct::Features) \
perl(Search::Elasticsearch::Client::8_0::Direct::Fleet) \
perl(Search::Elasticsearch::Client::8_0::Direct::Graph) \
perl(Search::Elasticsearch::Client::8_0::Direct::ILM) \
perl(Search::Elasticsearch::Client::8_0::Direct::Indices) \
perl(Search::Elasticsearch::Client::8_0::Direct::Ingest) \
perl(Search::Elasticsearch::Client::8_0::Direct::License) \
perl(Search::Elasticsearch::Client::8_0::Direct::Logstash) \
perl(Search::Elasticsearch::Client::8_0::Direct::ML) \
perl(Search::Elasticsearch::Client::8_0::Direct::Migration) \
perl(Search::Elasticsearch::Client::8_0::Direct::Monitoring) \
perl(Search::Elasticsearch::Client::8_0::Direct::Nodes) \
perl(Search::Elasticsearch::Client::8_0::Direct::Rollup) \
perl(Search::Elasticsearch::Client::8_0::Direct::SQL) \
perl(Search::Elasticsearch::Client::8_0::Direct::SSL) \
perl(Search::Elasticsearch::Client::8_0::Direct::SearchableSnapshots) \
perl(Search::Elasticsearch::Client::8_0::Direct::Security) \
perl(Search::Elasticsearch::Client::8_0::Direct::Shutdown) \
perl(Search::Elasticsearch::Client::8_0::Direct::Slm) \
perl(Search::Elasticsearch::Client::8_0::Direct::Snapshot) \
perl(Search::Elasticsearch::Client::8_0::Direct::Tasks) \
perl(Search::Elasticsearch::Client::8_0::Direct::Transform) \
perl(Search::Elasticsearch::Client::8_0::Direct::Watcher) \
perl(Search::Elasticsearch::Client::8_0::Direct::XPack) \
perl(Search::Elasticsearch::Client::8_0::Role::API) \
perl(Search::Elasticsearch::Client::8_0::Role::Bulk) \
perl(Search::Elasticsearch::Client::8_0::Role::Scroll) \
perl(Search::Elasticsearch::Client::8_0::Scroll) \
perl(Search::Elasticsearch::Client::8_0::TestServer) \
perl(Search::Elasticsearch::Cxn::Factory) \
perl(Search::Elasticsearch::Cxn::HTTPTiny) \
perl(Search::Elasticsearch::Cxn::LWP) \
perl(Search::Elasticsearch::CxnPool::Sniff) \
perl(Search::Elasticsearch::CxnPool::Static) \
perl(Search::Elasticsearch::CxnPool::Static::NoPing) \
perl(Search::Elasticsearch::Error) \
perl(Search::Elasticsearch::Logger::LogAny) \
perl(Search::Elasticsearch::Role::API) \
perl(Search::Elasticsearch::Role::Client) \
perl(Search::Elasticsearch::Role::Client::Direct) \
perl(Search::Elasticsearch::Role::Cxn) \
perl(Search::Elasticsearch::Role::CxnPool) \
perl(Search::Elasticsearch::Role::CxnPool::Sniff) \
perl(Search::Elasticsearch::Role::CxnPool::Static) \
perl(Search::Elasticsearch::Role::CxnPool::Static::NoPing) \
perl(Search::Elasticsearch::Role::Is_Sync) \
perl(Search::Elasticsearch::Role::Logger) \
perl(Search::Elasticsearch::Role::Serializer) \
perl(Search::Elasticsearch::Role::Serializer::JSON) \
perl(Search::Elasticsearch::Role::Transport) \
perl(Search::Elasticsearch::Serializer::JSON) \
perl(Search::Elasticsearch::Serializer::JSON::Cpanel) \
perl(Search::Elasticsearch::Serializer::JSON::PP) \
perl(Search::Elasticsearch::Serializer::JSON::XS) \
perl(Search::Elasticsearch::TestServer) \
perl(Search::Elasticsearch::Transport) \
perl(Search::Elasticsearch::Util) \
perl-Search-Elasticsearch"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Any::URI::Escape) \
perl(Devel::GlobalDestruction) \
perl(HTTP::Headers) \
perl(HTTP::Request) \
perl(HTTP::Tiny) \
perl(IO::Compress::Deflate) \
perl(IO::Compress::Gzip) \
perl(IO::Uncompress::Gunzip) \
perl(IO::Uncompress::Inflate) \
perl(JSON::MaybeXS) \
perl(JSON::PP) \
perl(LWP::UserAgent) \
perl(Log::Any) \
perl(Log::Any::Adapter) \
perl(Module::Runtime) \
perl(Moo) \
perl(Moo::Role) \
perl(Net::IP) \
perl(Package::Stash) \
perl(Sub::Exporter) \
perl(Try::Tiny) \
perl(URI) \
perl(namespace::clean)"

inherit rpm
