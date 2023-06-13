SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libvtk-m-2_0-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "ec9a78aa1b647ad6b10db818dfcf4fbcaadb450276ccc523d6d8d032b5ac5d7d2f6751d24eab0c145cf169e4c7a650c08b6d1f03d16a916bc9115af1ca495ca8"

RPROVIDES:${PN} += "libvtk-m-2_0 \
libvtk-m-2_0(aarch-64) \
libvtkm_cont.so.2.0()(64bit) \
libvtkm_cont_testing.so.2.0()(64bit) \
libvtkm_filter_clean_grid.so.2.0()(64bit) \
libvtkm_filter_connected_components.so.2.0()(64bit) \
libvtkm_filter_contour.so.2.0()(64bit) \
libvtkm_filter_core.so.2.0()(64bit) \
libvtkm_filter_density_estimate.so.2.0()(64bit) \
libvtkm_filter_entity_extraction.so.2.0()(64bit) \
libvtkm_filter_field_conversion.so.2.0()(64bit) \
libvtkm_filter_field_transform.so.2.0()(64bit) \
libvtkm_filter_flow.so.2.0()(64bit) \
libvtkm_filter_geometry_refinement.so.2.0()(64bit) \
libvtkm_filter_image_processing.so.2.0()(64bit) \
libvtkm_filter_mesh_info.so.2.0()(64bit) \
libvtkm_filter_multi_block.so.2.0()(64bit) \
libvtkm_filter_resampling.so.2.0()(64bit) \
libvtkm_filter_scalar_topology.so.2.0()(64bit) \
libvtkm_filter_vector_analysis.so.2.0()(64bit) \
libvtkm_filter_zfp.so.2.0()(64bit) \
libvtkm_io.so.2.0()(64bit) \
libvtkm_rendering.so.2.0()(64bit) \
libvtkm_rendering_testing.so.2.0()(64bit) \
libvtkm_source.so.2.0()(64bit) \
libvtkm_worklet.so.2.0()(64bit) \
libvtkmdiympi_nompi.so.2.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
