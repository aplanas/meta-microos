SUMMARY = "HTML forms using Moose"
DESCRIPTION = "*** Although documentation in this file provides some overview, it is \
mainly intended for API documentation. See HTML::FormHandler::Manual::Intro \
for an introduction, with links to other documentation. \
 \
HTML::FormHandler maintains a clean separation between form construction \
and form rendering. It allows you to define your forms and fields in a \
number of flexible ways. Although it provides renderers for HTML, you can \
define custom renderers for any kind of presentation. \
 \
HTML::FormHandler allows you to define form fields and validators. It can \
be used for both database and non-database forms, and will automatically \
update or create rows in a database. It can be used to process structured \
data that doesn't come from an HTML form. \
 \
One of its goals is to keep the controller/application program interface as \
simple as possible, and to minimize the duplication of code. In most cases, \
interfacing your controller to your form is only a few lines of code. \
 \
With FormHandler you shouldn't have to spend hours trying to figure out how \
to make a simple HTML change that would take one minute by hand. Because \
you _can_ do it by hand. Or you can automate HTML generation as much as you \
want, with template widgets or pure Perl rendering classes, and stay \
completely in control of what, where, and how much is done automatically. \
You can define custom renderers and display your rendered forms however you \
want. \
 \
You can split the pieces of your forms up into logical parts and compose \
complete forms from FormHandler classes, roles, fields, collections of \
validations, transformations and Moose type constraints. You can write \
custom methods to process forms, add any attribute you like, and use Moose \
method modifiers. FormHandler forms are Perl classes, so there's a lot of \
flexibility in what you can do. \
 \
HTML::FormHandler provides rendering through roles which are applied to \
form and field classes (although there's no reason you couldn't write a \
renderer as an external object either). There are currently two flavors: \
all-in-one solutions like HTML::FormHandler::Render::Simple and \
HTML::FormHandler::Render::Table that contain methods for rendering field \
widget classes, and the HTML::FormHandler::Widget roles, which are more \
atomic roles which are automatically applied to fields and form. See \
HTML::FormHandler::Manual::Rendering for more details. (And you can easily \
use hand-built forms - FormHandler doesn't care.) \
 \
The typical application for FormHandler would be in a Catalyst, \
DBIx::Class, Template Toolkit web application, but use is not limited to \
that. FormHandler can be used in any Perl application. \
 \
More Formhandler documentation and a tutorial can be found in the manual at \
HTML::FormHandler::Manual."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.40068"

RPM_NAME = "perl-HTML-FormHandler-0.40068-1.20.noarch.rpm"
RPM_HASH = "d7191b77b3a07c9a24ecd53b131dc5246b9e06bcdb12c9507c7f07fb66f7780d5dd24f1a89279a0fa82b7193bdd1aefbfb422b7c926c0d25e89a3bcd9f4a55c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::FormHandler) \
perl(HTML::FormHandler::Base) \
perl(HTML::FormHandler::Blocks) \
perl(HTML::FormHandler::BuildFields) \
perl(HTML::FormHandler::BuildPages) \
perl(HTML::FormHandler::Field) \
perl(HTML::FormHandler::Field::AddElement) \
perl(HTML::FormHandler::Field::BoolSelect) \
perl(HTML::FormHandler::Field::Boolean) \
perl(HTML::FormHandler::Field::Button) \
perl(HTML::FormHandler::Field::Captcha) \
perl(HTML::FormHandler::Field::Checkbox) \
perl(HTML::FormHandler::Field::Compound) \
perl(HTML::FormHandler::Field::Date) \
perl(HTML::FormHandler::Field::DateMDY) \
perl(HTML::FormHandler::Field::DateTime) \
perl(HTML::FormHandler::Field::Display) \
perl(HTML::FormHandler::Field::Duration) \
perl(HTML::FormHandler::Field::Email) \
perl(HTML::FormHandler::Field::File) \
perl(HTML::FormHandler::Field::Float) \
perl(HTML::FormHandler::Field::Hidden) \
perl(HTML::FormHandler::Field::Hour) \
perl(HTML::FormHandler::Field::IntRange) \
perl(HTML::FormHandler::Field::Integer) \
perl(HTML::FormHandler::Field::Minute) \
perl(HTML::FormHandler::Field::Money) \
perl(HTML::FormHandler::Field::Month) \
perl(HTML::FormHandler::Field::MonthDay) \
perl(HTML::FormHandler::Field::MonthName) \
perl(HTML::FormHandler::Field::Multiple) \
perl(HTML::FormHandler::Field::Nested) \
perl(HTML::FormHandler::Field::NoValue) \
perl(HTML::FormHandler::Field::NonEditable) \
perl(HTML::FormHandler::Field::Password) \
perl(HTML::FormHandler::Field::PasswordConf) \
perl(HTML::FormHandler::Field::PosInteger) \
perl(HTML::FormHandler::Field::PrimaryKey) \
perl(HTML::FormHandler::Field::Repeatable) \
perl(HTML::FormHandler::Field::RequestToken) \
perl(HTML::FormHandler::Field::Reset) \
perl(HTML::FormHandler::Field::Result) \
perl(HTML::FormHandler::Field::RmElement) \
perl(HTML::FormHandler::Field::Role::RequestToken) \
perl(HTML::FormHandler::Field::Second) \
perl(HTML::FormHandler::Field::Select) \
perl(HTML::FormHandler::Field::SelectCSV) \
perl(HTML::FormHandler::Field::Submit) \
perl(HTML::FormHandler::Field::Text) \
perl(HTML::FormHandler::Field::TextArea) \
perl(HTML::FormHandler::Field::TextCSV) \
perl(HTML::FormHandler::Field::Upload) \
perl(HTML::FormHandler::Field::Weekday) \
perl(HTML::FormHandler::Field::Year) \
perl(HTML::FormHandler::Fields) \
perl(HTML::FormHandler::Foo) \
perl(HTML::FormHandler::I18N) \
perl(HTML::FormHandler::I18N::ar_kw) \
perl(HTML::FormHandler::I18N::bg_bg) \
perl(HTML::FormHandler::I18N::ca_es) \
perl(HTML::FormHandler::I18N::cs_cz) \
perl(HTML::FormHandler::I18N::de_de) \
perl(HTML::FormHandler::I18N::en_us) \
perl(HTML::FormHandler::I18N::es_es) \
perl(HTML::FormHandler::I18N::hu_hu) \
perl(HTML::FormHandler::I18N::it_it) \
perl(HTML::FormHandler::I18N::ja_jp) \
perl(HTML::FormHandler::I18N::pt_br) \
perl(HTML::FormHandler::I18N::ru_ru) \
perl(HTML::FormHandler::I18N::sv_se) \
perl(HTML::FormHandler::I18N::tr_tr) \
perl(HTML::FormHandler::I18N::ua_ua) \
perl(HTML::FormHandler::InitResult) \
perl(HTML::FormHandler::Merge) \
perl(HTML::FormHandler::Model) \
perl(HTML::FormHandler::Model::Object) \
perl(HTML::FormHandler::Moose) \
perl(HTML::FormHandler::Moose::Role) \
perl(HTML::FormHandler::Page) \
perl(HTML::FormHandler::Page::Simple) \
perl(HTML::FormHandler::Pages) \
perl(HTML::FormHandler::Render::RepeatableJs) \
perl(HTML::FormHandler::Render::Simple) \
perl(HTML::FormHandler::Render::Table) \
perl(HTML::FormHandler::Render::Util) \
perl(HTML::FormHandler::Render::WithTT) \
perl(HTML::FormHandler::Result) \
perl(HTML::FormHandler::Result::Role) \
perl(HTML::FormHandler::Test) \
perl(HTML::FormHandler::TraitFor::Captcha) \
perl(HTML::FormHandler::TraitFor::I18N) \
perl(HTML::FormHandler::TraitFor::Types) \
perl(HTML::FormHandler::Traits) \
perl(HTML::FormHandler::Types) \
perl(HTML::FormHandler::Validate) \
perl(HTML::FormHandler::Widget::ApplyRole) \
perl(HTML::FormHandler::Widget::Block) \
perl(HTML::FormHandler::Widget::Block::Bootstrap) \
perl(HTML::FormHandler::Widget::Field::Button) \
perl(HTML::FormHandler::Widget::Field::ButtonTag) \
perl(HTML::FormHandler::Widget::Field::Captcha) \
perl(HTML::FormHandler::Widget::Field::Checkbox) \
perl(HTML::FormHandler::Widget::Field::CheckboxGroup) \
perl(HTML::FormHandler::Widget::Field::Compound) \
perl(HTML::FormHandler::Widget::Field::Hidden) \
perl(HTML::FormHandler::Widget::Field::HorizCheckboxGroup) \
perl(HTML::FormHandler::Widget::Field::NoRender) \
perl(HTML::FormHandler::Widget::Field::Password) \
perl(HTML::FormHandler::Widget::Field::RadioGroup) \
perl(HTML::FormHandler::Widget::Field::Repeatable) \
perl(HTML::FormHandler::Widget::Field::Reset) \
perl(HTML::FormHandler::Widget::Field::Role::HTMLAttributes) \
perl(HTML::FormHandler::Widget::Field::Role::SelectedOption) \
perl(HTML::FormHandler::Widget::Field::Select) \
perl(HTML::FormHandler::Widget::Field::Span) \
perl(HTML::FormHandler::Widget::Field::Submit) \
perl(HTML::FormHandler::Widget::Field::Text) \
perl(HTML::FormHandler::Widget::Field::Textarea) \
perl(HTML::FormHandler::Widget::Field::Upload) \
perl(HTML::FormHandler::Widget::Form::Role::HTMLAttributes) \
perl(HTML::FormHandler::Widget::Form::Simple) \
perl(HTML::FormHandler::Widget::Form::Table) \
perl(HTML::FormHandler::Widget::Theme::Bootstrap) \
perl(HTML::FormHandler::Widget::Theme::Bootstrap3) \
perl(HTML::FormHandler::Widget::Theme::BootstrapFormMessages) \
perl(HTML::FormHandler::Widget::Wrapper::Base) \
perl(HTML::FormHandler::Widget::Wrapper::Bootstrap) \
perl(HTML::FormHandler::Widget::Wrapper::Bootstrap3) \
perl(HTML::FormHandler::Widget::Wrapper::Fieldset) \
perl(HTML::FormHandler::Widget::Wrapper::None) \
perl(HTML::FormHandler::Widget::Wrapper::Simple) \
perl(HTML::FormHandler::Widget::Wrapper::SimpleInline) \
perl(HTML::FormHandler::Widget::Wrapper::Table) \
perl(HTML::FormHandler::Widget::Wrapper::TableInline) \
perl(HTML::FormHandler::Wizard) \
perl-HTML-FormHandler"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Load) \
perl(Crypt::Blowfish) \
perl(Crypt::CBC) \
perl(Data::Clone) \
perl(DateTime) \
perl(DateTime::Format::Strptime) \
perl(Email::Valid) \
perl(File::ShareDir) \
perl(HTML::Entities) \
perl(HTML::TreeBuilder) \
perl(JSON::MaybeXS) \
perl(List::Util) \
perl(Moose) \
perl(MooseX::Getopt) \
perl(MooseX::Types) \
perl(MooseX::Types::Common) \
perl(MooseX::Types::LoadableClass) \
perl(Sub::Exporter) \
perl(Sub::Name) \
perl(Try::Tiny) \
perl(aliased) \
perl(namespace::autoclean)"

inherit rpm
